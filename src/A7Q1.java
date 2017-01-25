
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for the number of students
        System.out.println("How many students?");
        //save the int as j 
        int j = input.nextInt();
        //set the amount of variables and create array
        double[] marks = new double[j];
        // marks[0]=input.nextDouble();
        for (int i = 0; i < marks.length; i++) {
            //Ask user for their marks,
            System.out.println("Please enter in the mark of student " + (i + 1));
            //save array i
            marks[i] = input.nextDouble();
        }
        //add the numbers 
        double total = 0;
        //add each number one by one 
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        //save a varaible for average
        double avg = total / marks.length;
        // tell user the average
        System.out.println("The class average is " + avg + "%");
        //end

    }
}
