package day19;

public class ExceptionHandling {
	public static void main(String[] args) {
		for(int i=0;i<=50;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
}