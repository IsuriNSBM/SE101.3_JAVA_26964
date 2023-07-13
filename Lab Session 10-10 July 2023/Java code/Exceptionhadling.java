

package com.mycompany.exceptionhadling;
import java.util.Scanner;

public class Exceptionhadling {

    public static void main(String[] args) {
        int no1,no2,ans;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter first number");
            no1=sc.nextInt();
            System.out.println("Enter Second number");
            no2=sc.nextInt();
            ans=no1/no2;
            System.out.println("Answer is"+ans);
        }
        catch(Exception e)
        {
            System.out.println("Number devided by zero error");
        }
    }
  
}
