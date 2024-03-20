package in.juhu.cdac;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Weight in kg: ");
		double weight= sc.nextDouble();

		System.out.print("Enter Your Height in meters: ");
		double height= sc.nextDouble();

		sc.close();

		double bmi= weight/(height*height);
		String category;

		if (bmi<18.5) {
			category= "Under Weight";
		}

		else if (bmi < 25) {
			category= "Under Weight";
		}

		else if (bmi <30) {
			category= "Over Weight";
		}

		else {
               category= "Obese";
		}

		System.out.println("Your BMI is: "+bmi);
		System.out.println("Your Category is : "+category);
		// TODO Auto-generated method stub

	}

}
