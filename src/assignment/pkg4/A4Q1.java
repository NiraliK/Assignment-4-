/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // add input scanner 
        Scanner input = new Scanner(System.in);
        String name;

        // system ask what their name is 
        System.out.println("Please enter your name");
        // in next line input the name 
        name = input.nextLine();
        //output: print hello, _____ (name), how are you today?
        System.out.println("Hello " + name + ". How are you?");
    }
}
