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
public class CardTools {
    
    /**
     * @param card
     * @return the integer value for the value of the card
     */
    public static int getCardNum(int card) {
        return card % 13;
    }
    
    /** 
     * @param card
     * @return the integer value for the suite of the card
     */
    public static int getSuiteNum(int card) {
        return card / 13;
    }

    /**
     * @param card
     * @return the string of the face value of the card
     */
    public static String getCard(int card) {
        int n = getCardNum(card);
        switch (n) {
            case 0:
                return "Ace";
            case 10:
                return "Jack";
            case 11:
                return "Queen";
            case 12:
                return "King";
            default:
                return n + 1 + "";
        }
    }

    /**
     * @param card
     * @return the string of the suite of the card
     */
    public static String getSuite(int card) {
        int n = getSuiteNum(card);
        switch (n) {
            case 0:
                return "Spades";
            case 1:
                return "Hearts";
            case 2:
                return "Clubs";
            default:
                return "Diamonds";
        }
    }
}
