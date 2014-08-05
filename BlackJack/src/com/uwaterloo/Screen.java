/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

import javax.swing.JFrame;

/**
 *
 * @author wojtekswiderski
 */
public class Screen extends JFrame{
    
    public Screen(int x, int y){
        this.setSize(x, y);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
