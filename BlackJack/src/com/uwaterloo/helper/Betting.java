/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uwaterloo.helper;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import com.uwaterloo.helper.InputDialogFrame;
 
/**
 *
 * @author Clarence
 */
public class Betting {
    private BufferedWriter writer;
    private final int STARTAMOUNT = 1000;
<<<<<<< HEAD


public void Write(int n){
    String[] namesArray = new String[n];
=======
    
    
    
    
    
    
public void Write(){
    String[] namesArray = new String[10];
>>>>>>> origin/master
        
        
     
        
        
        
    }
<<<<<<< HEAD
=======
    

    
>>>>>>> origin/master
    /**
     * Each new game starts the player with 1000 dollars and writes to a text file
     */
   
    public void inputValue() throws IOException{
        try{
            
        Scanner sc;
        sc = new Scanner (System.in);
        System.out.println("How much to bet? (1000)");
        String amount = sc.nextLine();
        
        File file = new File("Money.txt");
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(amount);
     
        } catch(IOException e) {
        System.err.println("Error");
     
        }
        
    }
    
    
}
