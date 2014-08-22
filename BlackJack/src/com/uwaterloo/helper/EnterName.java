/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo.helper;

import javax.swing.JTextField;

/**
 *
 * @author Clarence
 */
public class EnterName {
    
    public void Name(){
        JTextField newName = new JTextField("Enter Name Here");
        newName.setVisible(true);
        newName.setSize(300, 200);
        String saveNames = newName.getText();
        
    }
  
    
    
}