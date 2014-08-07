/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class Screen extends JFrame{
    
    public Screen(int a, int b, String title){
        setSize(a, b);
        setTitle(title);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel cp = new ContentPanel(a, b, "images/greenbackground.png");
        cp.setLayout(new BorderLayout());
        setContentPane(cp);
        JPanel pf = new PlayField(a, "images/cardsprite.png");
        cp.add(pf, BorderLayout.SOUTH);
    }
    
}
