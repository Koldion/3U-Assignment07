
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //create scanner for input
        Scanner input = new Scanner(System.in);
       
        //ask the user for the number of students
        System.out.println("How many students?");
        //save the int as j 
        int j = input.nextInt();
        //set the amount of variables and create array
        double[] height = new double[j];
        // marks[0]=input.nextDouble();
        for (int i = 0; i < height.length; i++) {
            //Ask user for their marks,
            System.out.println("Please enter in the height of student " + (i + 1));
            //save array i
            height[i] = input.nextDouble();
        }
        //add the numbers 
        double total = 0;
        //add each number one by one 
        for (int i = 0; i < height.length; i++) {
            total = total + height[i];
        }
        //save a varaible for average
        double avg = total / height.length;
        // tell user the average
        System.out.println("The average is " + avg + "%");
        //create for loop to count the heights larger than average
        for (int i = 0; i<avg;i++){
            //if the height is larger than the average
            if( height[i]>avg){
                //tell user which hieght it is
                System.out.println(height[i]);
            }
            //end
        }
    }
}
