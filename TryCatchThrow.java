package day19;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchThrow {
	public static void main(String[] args) {
		Scanner na = new Scanner(System.in);
		
		try {
			System.out.println("Enter your age");
			int age=na.nextInt();
			if(age>0) {
				System.out.println("This is valid age");
		 }
			else {
				System.out.println("This is Invalid age");
			}
		}catch(InputMismatchException e) {
			System.out.println("Enter the correct age");
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		na.close();
		
		
	}

}
