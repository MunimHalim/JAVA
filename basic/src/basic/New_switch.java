package basic;

import java.util.Scanner;

public class New_switch {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input your number");
	int num = sc.nextInt();
	
	//monday =1
	//tuesday =2
	
	//switch
	
	switch(num) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wed");
		break;
	case 4:
		System.out.println("Thurs");
		break;
	case 5:
		System.out.println("Fri");
		break;
	case 6:
//		System.out.println("Thurs");
//		break;
	case 7:
		System.out.println("weekend");
		break;
	default:
		System.out.println("Please input valid number");
	}
	}

		
}
