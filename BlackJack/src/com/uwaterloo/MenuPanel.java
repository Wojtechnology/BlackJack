/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo;

import com.uwaterloo.helper.DisplayTitle;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class MenuPanel extends JPanel {

    public MenuPanel(int a, int b, JPanel parentPanel) {
        
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
        JButton vsAI = new JButton();
        
        vsAI.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                parentPanel.removeAll();
                parentPanel.add(new OnePlayerPanel(a, b, parentPanel));
                parentPanel.repaint();
                parentPanel.revalidate();  
            }
        });
        
        vsAI.setPreferredSize(bSize);
        vsAI.setText("Play vs AI");
        vsAI.setVisible(true);
        add(vsAI, gc);

        gc.gridy = 2;
        JButton vOne = new JButton();
        vOne.setPreferredSize(bSize);
        vOne.setText("Play with 1 Friend");
        vOne.setVisible(true);
        vOne.setEnabled(false);
        add(vOne, gc);

        gc.weighty = 1000;
        gc.gridy = 3;
        JButton vTwo = new JButton();
        vTwo.setPreferredSize(bSize);
        vTwo.setText("Play with 2 Friends");
        vTwo.setVisible(true);
        vTwo.setEnabled(false);
        add(vTwo, gc);
    }

}
