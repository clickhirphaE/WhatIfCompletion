
import java.util.*;
public class WhatIfCompletion {
    public static void main(String args[]){
        int num1, num2,sum,product,Average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        sum=num1+num2;
        product=num1*num2;
        Average=sum/2;
        if(sum>200){
            System.out.println("The sum of two numbers is:"+ sum+"*");

            System.out.println(" Product of two numbers is: "+product);
            System.out.println(" The average of two numbers is: "+Average);
        }else if(sum<=200){
            System.out.println(" The sum of two numbers is:"+sum);
            System.out.println(" Product of two numbers is: "+product);
            System.out.println(" The average of two numbers is: "+Average);
        }



    }


}