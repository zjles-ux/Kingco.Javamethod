/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author KINGCO_CPE113
 */
public class method {

    /**
     * @param args the command line arguments
     */
   public class Enter_Input {

    //create method isEven
    private static int isEven(int currentNumber) {
        if (currentNumber % 2 == 0) {
                System.out.println(currentNumber + " is even\n");
            }
            else {
                System.out.println(currentNumber + " is odd\n");
        }//        
        return 0;
    }

    public static void main(String[] args) {

        int number = 0;
        
    }
    
}
 public static void main(String[] args) {

        int number = 0;

        Scanner input = new Scanner(System.in);
         {
            System.out.println("Enter number: ");
            number = input.nextInt();

            if (number == -1) {                
                
            }
            else  {
                Enter_Input.isEven(number);
            }
        }
        }
}
   
         