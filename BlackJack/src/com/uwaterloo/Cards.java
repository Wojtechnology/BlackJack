/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

/**
 *
 * @author wojtekswiderski
 */
public class Cards {
    
    private int[] cards = new int[52];
    private int shuffles;
    private int index;
    
    public Cards(int n){
        shuffles = n;
        initialize();
        shuffleAll();
    }
    
    /**
     * Fills the cards array with integers incrementing from 1 to 52
     */
    public void initialize(){
        index = 0;
        for(int i = 0; i < cards.length; i++){
            cards[i] = i;
        }
    }
    
    /**
     * Randomly scrambles the integers in the cards array
     */
    public void shuffleAll(){
        index = 0;
        for(int i = 0; i < shuffles; i++){
            int rand1 = (int)(52 * Math.random());
            int rand2 = (int)(52 * Math.random());
            if(rand1 != rand2){
                int temp = cards[rand1];
                cards[rand1] = cards[rand2];
                cards[rand2] = temp;
            }else{
                i--;
            }
        }
    }
    
    /**
     * Writes to the console the cards in order of increasing indexes
     */
    public void write(){
        System.out.printf("Current State of Cards:\n\n");
        for(int i = 0; i < cards.length; i++){
            int r = cards[i] % 13;
            int d = cards[i] / 13;
            String card;
            String suite;
            switch(r){
                case 0:
                    card = "Ace";
                    break;
                case 10:
                    card = "Jack";
                    break;
                case 11:
                    card = "Queen";
                    break;
                case 12:
                    card = "King";
                    break;
                default:
                    card = r + 1 + "";
                    break;
            }
            switch(d){
                case 0:
                    suite = "Spades";
                    break;
                case 1:
                    suite = "Hearts";
                    break;
                case 2:
                    suite = "Clubs";
                    break;
                case 3:
                    suite = "Diamonds";
                    break;
                default:
                    suite = null;
                    break;
            }
            System.out.printf("Card %d: %s of %s\n", i + 1, card, suite);
        }
        System.out.printf("\n");
    }
    
    /**
     * @return the integer of the current card
     */
    public int getCurrent(){
        int n = cards[index];
        index++;
        return n;
    }
}
