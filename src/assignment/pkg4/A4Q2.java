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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner created 
        Scanner input = new Scanner(System.in);
        String number;

        // system ask what their name is 
        System.out.println("Please enter the measurement in inches you wish to convert:");
        // in next line input the name 
        double inch = input.nextDouble();

        //conversion: 1 inche = 2.54cm 
        double answer = (inch * 2.54);
        //multiply the number of inches by 2.54 
        System.out.println(inch + " inches is the same as " + answer + " cm ");

    }

}
