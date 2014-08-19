/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo.helper;

/**
 *
 * @author wojtekswiderski
 */
public class Cards {
    
    private int[] cards;
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
        cards = new int[52];
        resetCounter();
        for(int i = 0; i < cards.length; i++){
            cards[i] = i;
        }
    }
    
    /**
     * Randomly scrambles the integers in the cards array
     */
    public void shuffleAll(){
        resetCounter();
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
            System.out.printf("Card %d: %s of %s\n", i + 1, CardTools.getCard(cards[i]), CardTools.getSuite(cards[i]));
        }
        System.out.printf("\n");
    }
    
    /**
     * @return the integer of the current card
     */
    public int getCurrent(){
        System.out.printf("Counter %d\n", index);
        int n = cards[index];
        index++;
        return n;
    }
    
    /**
     * Resets the index
     */
    public void resetCounter(){
        index = 0;
    }
    
    /**
     * Checks if cards need to be shuffled and if so shuffles them
     */
    public void checkShuffle(){
        if(index >= cards.length / 2){
            shuffleAll();
        }
    }
}
