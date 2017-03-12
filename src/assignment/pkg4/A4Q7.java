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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert scanner 
        Scanner input = new Scanner(System.in);

        //start at 1 
        double sum = 1;
        //create while loop; number limit 100
        while (sum < 100) {

            //player 1: what is the sum 
            System.out.println("Enter the sum of number:");
            double num = input.nextDouble();

            // calculations to add the previous number to the sum 
            sum = num + sum;

            //location of the snakes 
            //if the player lands on these numbers it will go down 
            if (sum == 54) {
                sum = 19;
            }
            if (sum == 90) {
                sum = 48;
            }
            if (sum == 99) {
                sum = 77;
            }

            //location of the ladders 
            //if the players land on these numbers it will go up 
            if (sum == 9) {
                sum = 34;
            }
            if (sum == 40) {
                sum = 64;
            }
            if (sum == 67) {
                sum = 86;
            }

            //tell player wht square they are on 
            System.out.println("You are now on " + sum);

            // if player lands on square 100: they win 
            if (sum == 100) {
                System.out.println("Congrats! You have won!");
            }

        }

    }

}
