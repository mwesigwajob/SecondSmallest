/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsmall;
import java.util.*;

/**
 *
 * @author jobmwesigwa
 */
public class SecondSmall {

    /**
     * @param args the command line arguments
     * Print out the 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int small = 0; // second smallest
        int smaller = 0; //smallest number
        int variable = 0; //new number
        
        for (int i =0; i<5; i++)
        {
            variable = input.nextInt();
            //First number is automatically the smallest
            if (i==0)
                smaller = variable;
            
            //incase subsquent numbers are smaller than the smallest
            if (variable<smaller)
            {
                small = smaller; 
                smaller = variable;
            }
            
            //If second number is not smallest, it becomes the smallest
            //if any number less than the second smallest is inserted, they 
            //update the second smallest
            else if (i == 1 || small > variable)
            {
                small = variable;
            }
                
                
        }
        
        System.out.println("The second smallest is " + small);
            
    }
    
}
