/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo;

import com.uwaterloo.helper.Betting;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author wojtekswiderski
 */
public class MainFrame extends JFrame{
    
    public MainFrame(int a, int b, String title){
        
        // setting up JFrame
        setSize(a, b);
        setTitle(title);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // setting  up the content panel
        JPanel cp = new ContentPanel(a, b);
        cp.setLayout(new CardLayout());
        setContentPane(cp);
        
        // giving the content panel its primary contents
        cp.add(new MenuPanel(a, b, cp, this));
    }
    
}
