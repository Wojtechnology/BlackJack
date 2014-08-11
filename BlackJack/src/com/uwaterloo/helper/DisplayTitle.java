/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo.helper;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author wojtekswiderski
 */
public class DisplayTitle extends JPanel {
    
    private Image titleImage;
    
    public DisplayTitle() {
        try {
            titleImage = ImageIO.read(new File("images/title.jpg"));
        } catch (Exception e) {
            System.out.printf("File not found\n");
        }
        
        setPreferredSize(new Dimension(titleImage.getWidth(null), titleImage.getHeight(null)));
        setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(titleImage, 0, 0, null);
    }
}
