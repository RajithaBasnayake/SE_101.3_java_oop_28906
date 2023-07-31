
package com.mycompany.l1prac01;

import java.util.Scanner;
public class L1Prac01 {

    public static void main(String[] args) 
    {
        //Q01--------------
       System.out.println("Hello World!");
        
       //Q02-------------------
      /*  System.out.println("Rajitha Basnayake");
        System.out.println("Computer Science");  */
        
        Scanner sc=new Scanner(System.in);
        String Name, Degree;
        System.out.println("Enter your Name ");
        Name=sc.nextLine();
        System.out.println("Enter your Degree ");
        Degree=sc.nextLine();
        
        System.out.println(Name);
        System.out.println(Degree);
        
        
        
    }
}
