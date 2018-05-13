/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladderlength;

import java.util.Scanner;

/**
 *
 * @author Benjamin Chinwe
 */
public class LadderLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declare the Scanner
        Scanner numbers = new Scanner(System.in);
        //User information
        System.out.println("Enter two numbers : wall height between 1 <= 10000 and ladder angle 1 <= 89. Enter '-1' to quit.");

        // While loop
        while (numbers.hasNextInt()) {
            int wallHeight = numbers.nextInt();
            double ladderAngle = numbers.nextDouble();
            
            //If statement to terminate the program
            if ((wallHeight == -1) || (ladderAngle == -1.0)) {
                System.exit(0); // Ends program
                System.out.println("Program ends! Thanks from Benjamin Chinwe 2018");
                
                
                //If else to check if wall heigth is within range and ladder angle is within range. Then print or output 
                // statement
            } else if ((wallHeight <= 10000) && (wallHeight >= 1) && (ladderAngle >= 1.0) && (ladderAngle <= 89.0)) {
                double ladderHeight = wallHeight / (Math.sin(Math.toRadians(ladderAngle)));
                System.out.println("The ladder length is : " + (int) Math.ceil(ladderHeight));
                
            } else { // Else statement if the input value is out of range 1<=h=>10000 and 1<=v=>89 
                System.out.println("Two numbers most be : wall height between 1 <= 10000 and ladder angle 1 <= 89. Enter '-1' to quit.");
            }
        }
    }
}
