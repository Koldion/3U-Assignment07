
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         //Create scanner
         Scanner input = new Scanner(System.in);
 
         //Create array with 10 positions
         int marks[] = new int[10];
 
         //Ask user for all marks
 
         for (int i = 0; i < marks.length; i++) {
 
             System.out.println("Please enter in mark " + (i + 1));
 
             marks[i] = input.nextInt();
         }
         
         //Start sorting array
        for ( int i = 0; i < marks.length -1; i++){
             for ( int b = 0; b <= marks.length -2 ; b++){
                 // comparing array values
                 if (marks[b] > marks[b+1]){
                     // storing the value of the array in lowtohigh variable
                     int lowtohigh = 0;
                     lowtohigh = marks[b];
                     // swapping values
                     marks[b] = marks[b+1];
                     // storing lowtohigh value in array
                    marks[b+1]= lowtohigh;
                     
                 }
             }
        }
        
         System.out.println("The marks in ascending order are: ");
         for (int i = 0; i < marks.length; i++) {
             System.out.println(marks[i]);
         }
     }
 }
     
    
