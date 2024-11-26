package day4;
import java.util.Scanner;

public class loops {
	public static void main(String [] args) {
		Scanner na =new Scanner(System.in);
		
		System.out.println("Enter your mark");
		int mark = na.nextInt();
			if(mark<=35) {
				System.out.println("Fail");
			}
			if(mark>=90) {
				System.out.println("Grade A");
			}
			if(mark<=70) {
				System.out.println("Grade B");
			}
			if(mark<=40) {
				System.out.println("Grade C");
			}
			else if(mark>=70) {
				System.out.println("Pass");
			}
}
}
