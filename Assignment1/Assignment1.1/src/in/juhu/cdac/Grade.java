package in.juhu.cdac;

import java.util.Scanner;

public class Grade{

        public static void main(String[] args) {
        int score; 
        char grade;

          Scanner sc =new Scanner(System.in);

          System.out.print("Enter Numerical grade: "); 
          score=sc.nextInt();

           if(score >90) {
                  grade='A';
            }
            else if(score >= 80) {
            	 grade='B';
            }
            else if(score>=70) {
            	 grade='C';
            }
            else if (score >=50) {
            	 grade='D'; 
            }
            else {
            	grade='F';
            }
              
          System.out.print("Grade is: "+grade);
          sc.close();
        }
}