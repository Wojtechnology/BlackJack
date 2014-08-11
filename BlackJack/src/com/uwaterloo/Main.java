/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class Main {
    
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;
    
    public static void main(String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame window = new MainFrame(WIDTH, HEIGHT, "Black Jack");
            }
        });
    }
}
