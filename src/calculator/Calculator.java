/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Kiyeon
 */

import java.util.*;

public class Calculator 
{
    private static double sum;
    private static double difference;
    private static double product;
    private static double quotient;
    
    private static int choice; 
    private static double n1, n2;
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        System.out.print("1st Number: ");
        n1 = input.nextDouble();
        System.out.print("2nd Number: ");
        n2 = input.nextDouble();
        
        System.out.println("\nPlease choose your operation: ");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        
        System.out.print("Choice: ");
        choice = input.nextInt();
        switch(choice)
        {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, add(n1,n2));
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, sub(n1,n2));
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, multiply(n1,n2));
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, divide(n1,n2));
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
    }
    
    public static double add(double x, double y)
    {
        return sum = x + y;
    }
    
    public static double sub(double x, double y)
    {
        return difference = x - y;
    }
    
    public static double multiply(double x, double y)
    {
        return product = x * y;
    }
    
    public static double divide(double x, double y)
    {
        return quotient = x / y;
    }
    
    
}
