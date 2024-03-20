package in.juhu.cdac;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number 1: "); 
		double num1= sc.nextDouble();

        System.out.print("Enter Operator (+,-,*/) : ");
        char operator= sc.next().charAt(0);

        System.out.print("Enter number 2: ");
        double num2 =sc.nextDouble();
        
        double result;

        switch (operator) {
        case'+':
        result =num1+ num2;
        break;
        
        case'-':
            result =num1- num2;
            break;
        case'*':
            result =num1* num2;
            break;
        case'/':
            result =num1/ num2;
            break;
            default:
            	System.out.println("Invalid Operator : ");
            	return;
        }
        
        System.out.println("Result : "+result);     
       
              
        }

}
