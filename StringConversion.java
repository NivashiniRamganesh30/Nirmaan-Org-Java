package day7;

public class StringConversion {
		String add (int a , int b) {
		return "add :"+(a+b);
		}
		String Sub (int a , int b) {
			return "Sub :"+(a-b);
			}
		String Mul (int a , int b) {
			return "Mul :"+(a*b);
			}
		String Div (int a , int b) {
			return "Div :"+(a/b);
			}
		String Mod (int a , int b) {
			return "Mod :"+(a%b);
			}
		public static void main(String[] args) {
			Conversion Niva =new Conversion();
			String number=Niva.add(80,40);
			System.out.println(number);
			String number1=Niva.Sub(80,40);
			System.out.println(number1);
			String number2=Niva.Mul(80,40);
			System.out.println(number2);			
			String number3=Niva.Div(80,40);
			System.out.println(number3);			
			String number4=Niva.Mod(80,40);
			System.out.println(number4);
		}
	}

