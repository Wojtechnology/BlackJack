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
    
    private BufferedImage readImage;
    private Image bgImage;
    
    public ContentPanel(int a, int b, String filepath){
        try{
            readImage = ImageIO.read(new File(filepath));
        }catch(Exception e){
            System.out.printf("File not found\n");
        }
        bgImage = readImage.getScaledInstance(a, b, Image.SCALE_SMOOTH);
        setBounds(0, 0, a, b);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bgImage, 0, 0, null);
    }
}
