
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class A7Q3 {

 /**
 +     * @param args the command line arguments
 +     */
     public static void main(String[] args) {
         //Create scanner
         Scanner input = new Scanner(System.in);
 
         //Create array to store 2 user values
        int numberarray[] = new int[2];
 
         //ask user for the 2 values
         for (int i = 0; i < numberarray.length; i++) {
             System.out.println("Please enter in number " + (i + 1));
 
             numberarray[i] = input.nextInt();
        }
 
         //switch values in order from ascending order
 
         //create a variable in order to switch the positions
         int difference = 0;
 
         //if the first number is greater than the second one
         if (numberarray[0] >numberarray[1]) {
             //find the difference between the numbers
             difference = numberarray[0] - numberarray[1];
             //subtract difference from bigger number
            numberarray[0] = numberarray[0] - difference;
             //add difference to smaller number
             numberarray[1] = numberarray[1] + difference;
         }
           //tell user the numbers in ascending order 
         System.out.println("The numbers in ascending order are: ");
         for (int i = 0; i < numberarray.length; i++) {
             System.out.println(numberarray[i]);
        }
 
     }
}