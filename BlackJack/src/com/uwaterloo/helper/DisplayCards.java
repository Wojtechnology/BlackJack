/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo.helper;

import java.awt.*;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Clarence
 */
public class DisplayCards extends JPanel {

    private Image[] cardsArray;

    public DisplayCards(List<Integer> cardsList, Image[][] sprites) {
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
        for(int i = 0; i < cardsArray.length; i++){
            g.drawImage(cardsArray[i], i * 25, 0, null);
        }
    }
}
