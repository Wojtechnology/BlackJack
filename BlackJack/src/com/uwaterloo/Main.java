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
                
                
                String titleBlackjack= new String("BLACKJACK");
		
		
		JLabel title = new JLabel(titleBlackjack); //place holder until we can come up with real logo
		title.setBounds(442, 50, 150, 100);
		
		
		
		JButton vsAI = new JButton();
		vsAI.setBounds(400, 400, 150, 100);
		vsAI.setText("Play vs AI");
		vsAI.setVisible(true);
		
		
		JButton vOne = new JButton();
		vOne.setBounds(400, 500, 150, 100);
		vOne.setText("Play with 1 Friend");
		vOne.setVisible(true);
		
		JButton vTwo = new JButton();
		vTwo.setBounds(400, 600, 150, 100);
		vTwo.setText("Play with 2 Friends");
		vTwo.setVisible(true);
		
		
		//ignore this one, added because last button implemented always takes up the whole screen.

		JButton vDummy = new JButton();
		vDummy.setBounds(0,0,1,1);
		vDummy.setText("");
		vDummy.setVisible(false);
		
		
		window.add(title);
		window.add(vsAI);
		window.add(vOne);
		window.add(vTwo);
		window.add(vDummy);//ignore
		
                
                
            }
        });
        Cards deck = new Cards(1000);
    }
}
