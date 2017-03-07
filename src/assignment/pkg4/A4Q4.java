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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner created 
        Scanner input = new Scanner(System.in);
        String number;

        // system ask the food cost 
        System.out.println("How much does the food for prom cost?");
        // input in next line 
        double one = input.nextDouble();
        // System ask DJ cost 
        System.out.println("How much does the DJ cost?");
        // input in next line 
        double two = input.nextDouble();
        // System ask the cost for rent
        System.out.println("How much does it cost to rent the hall?");
        // input in next line 
        double three = input.nextDouble();
        // System ask the cost for decorations 
        System.out.println("How much does the decorations cost?");
        // input in next line 
        double four = input.nextDouble();
        // System ask the cost of staff 
        System.out.println("How much does it cost for the staff?");
        // input in next line 
        double five = input.nextDouble();
        // System ask the cost for miscellaneous 
        System.out.println("How much for miscellanrous costs?");
        // input in next line 
        double six = input.nextDouble();

        // calculate total cost 
        double cost = (one + two + three + four + five + six);

        // divide by ticket price($35)
        double answer = (cost / 35);

        //output the total cost and the number of tickets tht have to be sold 
        System.out.println(" The cost is " + cost + ". You will need to sell " + answer + " to break even. ");

        // 
    }

}
