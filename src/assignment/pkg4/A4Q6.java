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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert scanner 
        //insert string
        Scanner input = new Scanner(System.in);

        //ask  the speed 
        System.out.println("Enter the speed limit:");
        double limit = input.nextDouble();
        // ask the spped of the car 
        System.out.println("Enter the record speed of the car:");
        double speed = input.nextDouble();
        //subtract the limit by the speed 
        double answer = (speed - limit);

        // if the answer is over by 1- 20 fine is $100 
        if (answer > 1 && answer <= 20) {
            System.out.println("You are speeding. Your fine is $100!");
        }
        //if answer is >= 21 and it is <= 30. fine is 270 
        if (answer >= 21 && answer <= 30) {
            System.out.println("You are speeding. Your fine is $270!");
        }
        if (answer >= 31) {
            System.out.println("You are speeding. Your fine is $500!");
        }
        if (answer < 1) {
            System.out.println("Congratulations, you are within the speedlimit!");
        }
   
    }

}
