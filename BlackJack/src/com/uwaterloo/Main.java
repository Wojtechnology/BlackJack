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
    
    public static void main(String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame window = new Screen(1024, 768, "Black Jack");
            }
        });
        Cards deck = new Cards(1000);
    }
}
