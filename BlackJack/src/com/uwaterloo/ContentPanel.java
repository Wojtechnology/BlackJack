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
public class ContentPanel extends JPanel{
    
    private BufferedImage bgimage;
    
    public ContentPanel(String filepath){
        System.out.printf("Reading from %s\n", filepath);
        try{
            bgimage = ImageIO.read(new File("greenbackground.png"));
        }catch(Exception e){
            System.out.printf("File not found\n");
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bgimage, 0, 0, null);
    }
}
