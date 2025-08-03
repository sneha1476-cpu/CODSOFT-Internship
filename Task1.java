package com.internship;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
	public static int menu(Scanner sc) {
		System.out.println("----menu-----");
		System.out.println("0. Exit");
		System.out.println("1. Play");
		System.out.println("enter the choice : ");
		int ch=sc.nextInt();
		return ch;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random random =new Random();
		int ch;
		int score=0;
		int roundswin=0;
		int attemp=10;
		int totalrounds=0;
		while((ch=menu(sc))!=0) {
			if(ch==1) {
				int num = random.nextInt(100)+1;
				System.out.println(num);
				System.out.println("the number of attempts that user has to guess the number is " + attemp);
			    int guess;
			    totalrounds++;
			    
			    for(int i=0;i<attemp;i++){
		            System.out.println("enter your guess for the generated number.");
		            guess = sc.nextInt();
		            if(num == guess)
		            {
		                System.out.println("the guess is correct");
		                score +=(attemp-i);
		                roundswin++;
		                System.out.println("total round played: "+ totalrounds);
		                System.out.println("total round win: "+ roundswin);
		        		System.out.println("total score : "+ score);
		                break;
		            }
		            else if(num > guess){
		                System.out.println("the guess is too low");
		            }
		            else{
		                System.out.println("the guess is too high");
		            }
			}
			    if(attemp==10) {
	            	System.out.println("you have used the multiple attemp .The number was"+num);
	            }
			
	            
	            
		    }
			else {
				System.out.println("invalid choice");
			}
        }
		
        
	}
}
