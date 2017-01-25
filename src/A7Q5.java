
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangn9757
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks?");
        int x = input.nextInt();
        //Create array with x positions
        int marks[] = new int[x];

        //Asn user for all marks

        for (int i = 0; i < marks.length; i++) {

            System.out.println("Please enter in marn " + (i + 1));

            marks[i] = input.nextInt();
        }

        for (int i = 0; i < marks.length - 1; i++) {
            //for loop compare marks
            for (int n = 0; n < marks.length - 2; n++) {
                // comparing the marks
                if (marks[n] > marks[n + 1]) {
                    // stroing the value of the array in lowtohigh variable
                    int ascending = 0;
                    ascending = marks[n];
                    // swapping the values
                    marks[n] = marks[n + 1];
                    //storing the lowtohigh value in the array
                    marks[n + 1] = ascending;
                }
            }
        }
        System.out.print("The marks form lowest to highest is :");
        // output of the marks form lowest to highest
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int b = 0; b < marks.length; b++) {
            }
        }
        // create a variable to store the medians
        int medians = 0;
        // if the array is even
        if (marks.length % 2 == 0) {
            medians = marks[marks.length / 2];
        } else {
            // if the array is even
            medians = marks[marks.length / 2];
        }
        // outputing the medians of the marks
        System.out.print("The medians is: " + medians);
    }
}
