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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // add input scanner 
        Scanner input = new Scanner(System.in);
        String name;

        // Add name
        System.out.println("Please enter your name:");
        // in next line input the name 
        name = input.nextLine();
        //output: print name
        System.out.println("name");

        //ask questions about test 1 
        //wht the test of out of
        System.out.println("What was the first test out of?");
        // tranfer to next line 
        double T1 = input.nextDouble();
        // ask the mark 
        System.out.println("what mark did you get?");
        // transfer to next line 
        double M1 = input.nextDouble();

        //ask questions about test 2 
        //wht the test of out of
        System.out.println("What was the second test out of?");
        // tranfer to next line 
        double T2 = input.nextDouble();
        // ask the mark 
        System.out.println("what mark did you get?");
        // transfer to next line 
        double M2 = input.nextDouble();

        //ask questions about test 3 
        //wht the test of out of
        System.out.println("What was the third test out of?");
        // tranfer to next line 
        double T3 = input.nextDouble();
        // ask the mark 
        System.out.println("what mark did you get?");
        // transfer to next line 
        double M3 = input.nextDouble();

        //ask questions about test 4 
        //wht the test of out of
        System.out.println("What was the fourth test out of?");
        // tranfer to next line 
        double T4 = input.nextDouble();
        // ask the mark 
        System.out.println("what mark did you get?");
        // transfer to next line 
        double M4 = input.nextDouble();

        //ask questions about test 5 
        //wht the test of out of
        System.out.println("What was the fifth test out of?");
        // tranfer to next line 
        double T5 = input.nextDouble();
        // ask the mark 
        System.out.println("what mark did you get?");
        // transfer to next line 
        double M5 = input.nextDouble();

        // total each test score in percentage 
        double score1 = (M1 / T1) * 100;
        double score2 = (M2 / T2) * 100;
        double score3 = (M3 / T3) * 100;
        double score4 = (M4 / T4) * 100;
        double score5 = (M5 / T5) * 100;

        //calculate the average 
        double answer = (score1 + score2 + score3 + score4 + score5);
        double average = (answer / 5);

        //output: print final average 
        System.out.println(" Average " + average + ". ");

    }

}
