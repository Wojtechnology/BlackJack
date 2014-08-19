/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo;

import com.uwaterloo.helper.Betting;
import com.uwaterloo.helper.DisplayTitle;
import com.uwaterloo.helper.InputDialogFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class MenuPanel extends JPanel {

    public MenuPanel(int a, int b, JPanel parentPanel, JFrame mainFrame) {
        
        setVisible(true);
        setPreferredSize(new Dimension(a, b));
        setOpaque(false);
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(10, 0, 0, 0);
        gc.anchor = GridBagConstraints.NORTH;
        gc.gridx = 0;
        gc.gridy = 0;
        JPanel title = new DisplayTitle();
        add(title, gc);
        
        Dimension bSize = new Dimension(150, 50);
        
        gc.gridy = 1;
        JButton play = new JButton("Play");
        
        play.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog name = new InputDialogFrame(a, b, parentPanel);
            }
        });
        
        play.setPreferredSize(bSize);
        play.setVisible(true);
        add(play, gc);

        gc.gridy = 2;
        JButton settings = new JButton("Settings");
        settings.setPreferredSize(bSize);
        settings.setVisible(true);
        settings.setEnabled(false);
        add(settings, gc);

        gc.weighty = 1000;
        gc.gridy = 3;
        JButton exit = new JButton("Exit");
        exit.setPreferredSize(bSize);
        exit.setVisible(true);
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                mainFrame.dispose();
            }
        });
        
        add(exit, gc);
    }

}
