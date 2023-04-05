/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class UniqueNums {
    public static void main(String[]args){
    
        int[]number = new int[5];
        Scanner in = new Scanner(System.in);
         int num=0, numValues=0;
        boolean valid = true;
          while(numValues<number.length){
        do{
            valid=true;
            System.out.print("Please enter a unique number: ");
            num = in.nextInt();
            for(int i = 0; i<numValues; i++)
            {
                if(num == number[1]){
                    System.out.println("Number already exists");
                    valid = false;
                    break;
                }
            }
        }while(!valid);
        number[numValues] = num;
        numValues++;
    
    }
    }
}
