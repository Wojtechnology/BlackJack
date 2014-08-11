/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

import com.uwaterloo.helper.CardTools;
import com.uwaterloo.helper.Cards;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class OnePlayerPanel extends JPanel{
    
    private Cards cards;
    
    private Image[][] sprites = new Image[4][13];
    
    public OnePlayerPanel(int a, int b, JPanel parentPanel){
        
        sprites = CardTools.createSprites("images/cardsprite.png");
        cards = new Cards(1000);
        
        Dimension size = new Dimension(a, b);
        setVisible(true);
        setPreferredSize(size);
        setOpaque(false);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        
        JLabel test = new JLabel("Hello World");
    }
    
    
}
