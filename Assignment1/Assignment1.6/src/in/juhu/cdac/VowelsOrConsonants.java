package in.juhu.cdac;

import java.util.Scanner;

public class VowelsOrConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a Character: ");

		char ch= sc.next().charAt(0);

		sc.close();

		if((ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch== 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
         System.out.println(ch+" is a Vowlel. ");
		}

		 else if ((ch >='a' && ch<='z') || ch=='A' && ch<='Z') {
			 System.out.println(ch+" is a Consonant.");
		}
		else {
			System.out.println(ch+ " is Invalid");
		}

	}

}
