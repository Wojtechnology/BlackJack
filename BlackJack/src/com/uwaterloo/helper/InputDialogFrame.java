/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uwaterloo.helper;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Clarence
 */
public class InputDialogFrame extends JFrame {

    public InputDialogFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Enter Name");
        setVisible(true);
        setSize(400, 300);
        setLocationRelativeTo(null);

    }
}
