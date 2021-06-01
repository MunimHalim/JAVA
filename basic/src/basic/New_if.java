package basic;

import java.util.Scanner;

public class New_if {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your marks");
		int marks = sc.nextInt();
		
		//if
//		if(marks >= 50) {
//			System.out.println("pass");
//		}
		
		//if-else
//		if(marks >= 50) {
//			System.out.println('pass');
//			else {
//				System.out.println("failed");
//			}
//		}
		//if-else-if
//		if(marks >= 80) {
//			System.out.println("A");
//		}else if (marks >= 70) {
//			System.out.println("B"); 
//		}else if (marks >= 70) {
//			System.out.println("C"); 
//			}

		//nested if
		if(marks >= 50) {
			System.out.println("Pass");
			if(marks >= 80) {
				System.out.println("High Distinction");
				if(marks >= 90) {
					System.out.println("Great");
					
				}
			}
		}
}
	
}
