/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo.helper;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author wojtekswiderski
 */
public class CardTools {
    
    public static final int CARDWIDTH = 225;
    public static final int CARDHEIGHT = 315;
    
    private static BufferedImage spriteSheet;
    
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
    
    /**
     * Reads the sprite sheet of cards from filepath and creates individual images
     * for each card
     * @param filepath 
     */
    public static Image[][] createSprites(String filepath){
        try{
            spriteSheet = ImageIO.read(new File(filepath));
        }catch(Exception e){
            System.out.printf("File not found\n");
        }
        Image[][] sprites = new Image[4][13];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                BufferedImage tempImage = spriteSheet.getSubimage(CARDWIDTH * j, CARDHEIGHT * i, CARDWIDTH, CARDHEIGHT);
                sprites[i][j] = tempImage.getScaledInstance(CARDWIDTH * 2 / 3, CARDHEIGHT * 2 / 3, Image.SCALE_SMOOTH);
            }
        }
        return sprites;
    }
}
