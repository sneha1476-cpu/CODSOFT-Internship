package com.internship;

import java.util.Scanner;
public class Task2 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no.of subjects ");
			int n =sc.nextInt();
			int [] arr = new int[n];
			if(n<=0) {
				System.out.println("invalid number of subjects");
			}
			int sum=0;
			char grade;
			System.out.println("enter the marks of the "+n+" subject out of 100");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			int avg=sum/n;
			
			int totalMarks = n*100;
			double percentage =(((double)sum/totalMarks)*100);
			if(percentage >= 90 && percentage <= 100)
			{
				grade ='A';
			}
			else if(percentage >= 80 && percentage <= 90) {
				grade ='B';
			}
			else if(percentage >= 70 && percentage <= 80) {
				grade ='C';
			}
			else if(percentage >= 60 && percentage <= 70) {
				grade ='D';
			}
			else if(percentage >= 50 && percentage <= 60) {
				grade ='E';
			}
			else {
				grade ='F';
			}
			System.out.println("total sum is: " + sum);
			System.out.println("avergae of marks is: " + avg);
			System.out.println("percentage: " + percentage);
			System.out.println("Grade: " + grade);
			
		}
		
}
