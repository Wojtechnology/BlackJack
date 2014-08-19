/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo.helper;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Clarence
 */
public class DisplayCards extends JPanel {

    private Image[] cardsArray;
    private boolean dealer;

    public DisplayCards(List<Integer> cardsList, Image[][] sprites, boolean inDealer) {
        dealer = inDealer;
        Dimension size = new Dimension(sprites[0][0].getWidth(null) + (cardsList.size() - 1) * 25, sprites[0][0].getHeight(null));
        setOpaque(false);
        setPreferredSize(size);
        cardsArray = new Image[cardsList.size()];
        for (int i = 0; i < cardsList.size(); i++) {
            cardsArray[i] = sprites[CardTools.getSuiteNum(cardsList.get(i))][CardTools.getCardNum(cardsList.get(i))];
        }

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(dealer){
            try {
                g.drawImage(ImageIO.read(new File("images/cardback.png")).getScaledInstance(150, 210, Image.SCALE_SMOOTH), 0, 0, null);
            } catch (Exception e) {
                System.out.printf("File not found\n");
            }
            for(int i = 1; i < cardsArray.length; i++){
                g.drawImage(cardsArray[i], i * 25, 0, null);
            }
        }else{
            for(int i = 0; i < cardsArray.length; i++){
                g.drawImage(cardsArray[i], i * 25, 0, null);
            }
        }
    }
}
