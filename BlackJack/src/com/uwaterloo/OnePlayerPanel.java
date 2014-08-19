/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo;

import com.uwaterloo.helper.CardTools;
import com.uwaterloo.helper.Cards;
import com.uwaterloo.helper.DisplayCards;
import com.uwaterloo.helper.DisplayTitle;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class OnePlayerPanel extends JPanel {

    private Cards cards;
    private JPanel ref;
    private boolean dealt;

    private Image[][] sprites = new Image[4][13];

    private List<Integer> dealerList;
    private List<Integer> playerList;

    public OnePlayerPanel(int a, int b, JPanel parentPanel, Cards inCards) {

        ref = this;
        dealt = false;

        sprites = CardTools.createSprites("images/cardsprite.png");
        cards = inCards;

        dealerList = new ArrayList<Integer>();
        playerList = new ArrayList<Integer>();

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

        // configuring dealer's box
        gc.gridx = 0;
        gc.weightx = 2;
        JPanel dealer = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 0, 0, 50));
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            }
        };
        dealer.setVisible(true);
        dealer.setOpaque(false);
        dealer.setLayout(new GridBagLayout());
        GridBagConstraints gcDealer = new GridBagConstraints();
        gcDealer.anchor = GridBagConstraints.CENTER;
        gcDealer.gridy = 0;
        gcDealer.weighty = 1;
        gcDealer.insets = new Insets(5, 0, 0, 0);
        JLabel dealerLbl = new JLabel("Dealer's Hand");
        dealerLbl.setForeground(Color.WHITE);
        dealerLbl.setFont(new Font("sans-serif", Font.BOLD, 20));
        dealer.add(dealerLbl, gcDealer);
        add(dealer, gc);

        // configuring player's box
        gc.gridx = 2;
        JPanel player = new JPanel();
        player.setVisible(true);
        player.setOpaque(false);
        player.setLayout(new GridBagLayout());
        GridBagConstraints gcPlayer = new GridBagConstraints();
        gcPlayer.anchor = GridBagConstraints.CENTER;
        JLabel playerLbl = new JLabel("Player's Hand");
        playerLbl.setForeground(Color.WHITE);
        playerLbl.setFont(new Font("sans-serif", Font.BOLD, 20));
        gcPlayer.gridy = 0;
        gcPlayer.weighty = 1;
        gcPlayer.insets = new Insets(5, 0, 0, 0);
        player.add(playerLbl, gcPlayer);
        add(player, gc);

        // events (not working as of now)
        // put all variables as global
        betBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!dealt) {
                    dealt = true;
                    for (int i = 0; i < 2; i++) {
                        dealerList.add(cards.getCurrent());
                        playerList.add(cards.getCurrent());
                    }
                    gcDealer.gridy = 1;
                    gcDealer.weighty = 1000;
                    dealer.add(new DisplayCards(dealerList, sprites, true), gcDealer);
                    gcPlayer.weighty = 1000;
                    gcPlayer.gridy = 1;
                    player.add(new DisplayCards(playerList, sprites, false), gcPlayer);
                    
                }
            }
        });
    }
}
