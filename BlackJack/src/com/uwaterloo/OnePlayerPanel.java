/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo;

import com.uwaterloo.helper.CardTools;
import com.uwaterloo.helper.Cards;
import com.uwaterloo.helper.DisplayTitle;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author wojtekswiderski
 */
public class OnePlayerPanel extends JPanel {

    private Cards cards;

    private Image[][] sprites = new Image[4][13];

    public OnePlayerPanel(int a, int b, JPanel parentPanel) {

        sprites = CardTools.createSprites("images/cardsprite.png");
        cards = new Cards(1000);

        Dimension size = new Dimension(a, b);
        setVisible(true);
        setPreferredSize(size);
        setOpaque(false);
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.NORTH;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(10, 0, 0, 0);
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        JPanel title = new DisplayTitle();
        add(title, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.gridwidth = 1;
        gc.weighty = 1000;
        gc.fill = GridBagConstraints.BOTH;
        JPanel controls = new JPanel();
        controls.setVisible(true);
        controls.setOpaque(false);

        // configuring panel for control of game
        Dimension bSize = new Dimension(150, 25);
        
        controls.setLayout(new GridBagLayout());
        GridBagConstraints gcControls = new GridBagConstraints();
        gcControls.weighty = 1;
        gcControls.weightx = 1;
        gcControls.gridx = 0;
        gcControls.gridy = 0;
        gcControls.insets = new Insets(5, 0, 0, 0);
        gcControls.anchor = GridBagConstraints.NORTH;
        
        JTextField betFld = new JTextField("Enter Bet Amount");
        betFld.setPreferredSize(bSize);
        controls.add(betFld, gcControls);
        String betAmount = betFld.getText();
        
        
        gcControls.gridy = 1;
        gcControls.weighty = 1000;
        JButton betBtn = new JButton("Lock in Bet");
        betBtn.setPreferredSize(bSize);
        controls.add(betBtn, gcControls);

        add(controls, gc);

        gc.gridx = 0;
        gc.weightx = 2;
        JPanel dealer = new JPanel();
        dealer.setVisible(true);
        dealer.setOpaque(false);
        add(dealer, gc);

        gc.gridx = 2;
        JPanel player = new JPanel();
        player.setVisible(true);
        player.setOpaque(false);
        add(player, gc);

    }
}
