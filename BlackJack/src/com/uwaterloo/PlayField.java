/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class PlayField extends JPanel{
    
    private final int CARDWIDTH = 225;
    private final int CARDHEIGHT = 315;
    
    private BufferedImage spriteSheet;
    private Image[][] sprites = new Image[4][13];
    
    public PlayField(int a, String filepath){
        Dimension size = new Dimension(a, 400);
        setVisible(true);
        setPreferredSize(size);
        setOpaque(false);
        
        createSprites(filepath);
    }
    
    /**
     * Reads the sprite sheet of cards from filepath and creates individual images
     * for each card
     * @param filepath 
     */
    public void createSprites(String filepath){
        try{
            spriteSheet = ImageIO.read(new File(filepath));
        }catch(Exception e){
            System.out.printf("File not found\n");
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                BufferedImage tempImage = spriteSheet.getSubimage(CARDWIDTH * j, CARDHEIGHT * i, CARDWIDTH, CARDHEIGHT);
                sprites[i][j] = tempImage.getScaledInstance(CARDWIDTH * 2 / 3, CARDHEIGHT * 2 / 3, Image.SCALE_SMOOTH);
            }
        }
    }
}
