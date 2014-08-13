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
public class InputDialogFrame extends JFrame{
    public static void main (String args[]){
    }
    
    
    public void run(){
    new InputDialogFrame().setVisible(true);
    }
    
    public InputDialogFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Enter Name");
        setSize(400,300);
        setLocationRelativeTo(null);
        String addName = JOptionPane.showInputDialog("Enter your name here");
        
        
    }
    
}
