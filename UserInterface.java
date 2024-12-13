package day15;
import java.util.Scanner;
public class UserInterface {
public static void main(String[] args) {
	Calculator cal = new Calculator();
	Scanner na = new Scanner(System.in);
	System.out.println("Enter the 1st Value :");
	int a = na.nextInt();
	System.out.println("Enter the 2nd Value  :");
	int b = na.nextInt();
	
	System.out.println("Addition :"+ cal.add(a, b));
	System.out.println("Subtraction :"+cal.sub(a, b));
	System.out.println("Multiplication :"+cal.mul(a, b));
	System.out.println("Division :"+cal.div(a, b));
	na.close();
}
}
