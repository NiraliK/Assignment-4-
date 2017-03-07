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
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner created 
        Scanner input = new Scanner(System.in);
        //output: print "hello world"
        //string created 
        System.out.println("Please enter you name:");
        String name = "Nirali";
        String name2 = input.nextLine();
        System.out.println("Hello " + name2);

        //ask user wht year their were born 
        //calculate their aprox age 
        System.out.println("What year you were born?");
        int year = input.nextInt();

        int answer = (2017 - year);
        if (answer > 0) {
            System.out.println("You are " + answer + " years old.");

        } else {
            System.out.println("You must be lying!!!");
        }
    }
}
