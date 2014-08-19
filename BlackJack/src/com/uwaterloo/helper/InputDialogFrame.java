/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo.helper;

import com.uwaterloo.OnePlayerPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Clarence
 */
public class InputDialogFrame extends JDialog {

    public InputDialogFrame(int a, int b, JPanel parentPanel) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Enter Name");
        setResizable(false);
        setVisible(true);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JButton enter = new JButton("Start Game");
        enter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(new OnePlayerPanel(a, b, parentPanel, new Cards(1000)));
                parentPanel.repaint();
                parentPanel.revalidate();
                dispose();
            }
        });
        add(enter, BorderLayout.SOUTH);
    }
}
