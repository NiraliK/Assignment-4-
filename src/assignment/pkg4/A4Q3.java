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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        String number;

        // system ask what the 4 numbers 
        System.out.println("Please enter in 4 numbers on seperate lines:");
        // input number in next line
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        double four = input.nextDouble();

        // output all number in one line 
        System.out.println(" Your numbers were " + one + ", " + two + ", " + three + ", and " + four + ". ");
    }

}
