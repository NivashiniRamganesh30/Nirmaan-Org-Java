package day12;

import java.util.Scanner;

public class MainLibrary1 {
	public static void main(String[] args) {
		LibraryManagement1 lm=new LibraryManagement1();
		Scanner na=new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("Enter your choice :");
		System.out.println("1 for Add");
		System.out.println("2 for Update");
		System.out.println("3 for Show");
		System.out.println("0 for Exit");
		int key =na.nextInt();
		na.nextLine();  
		
			switch (key) {
		case 1: {
			System.out.println("Enter Title :");
			String title=na.nextLine();
			lm.settitle(title);
			
			System.out.println("Enter Author :");
			String author=na.nextLine();
			lm.setAuthor(author);
			
			System.out.println("Enter Price :");
			double price=na.nextDouble();		
			lm.setPrice(price);
			System.out.println("Enter NumOfCopies :");
			int copies=na.nextInt();
			lm.setCopies(copies);
			break;
			}
		
		case 2:{
			System.out.println("Enter Title :");
			String title=na.nextLine();
			lm.settitle(title);
			
			System.out.println("Enter Author :");
			String author=na.nextLine();
			lm.setAuthor(author);
			
			System.out.println("Enter Price :");
			double price=na.nextDouble();		
			lm.setPrice(price);
			
			System.out.println("Enter NumOfCopies :");
			int copies=na.nextInt();
			lm.setCopies(copies);
			break;
		}
		case 3:{
			System.out.println(lm);
			break;
		}
		default:{
			System.out.println("Enter your choice");
		}
		case 0:{
			(isTrue)=false;
			System.out.println("Thank You");
			break;
}
	}
			
}
	}
}



