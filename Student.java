package day7;

public class Student {
	String studentname="";
    int age=0;
    String gender="";
    int dayspresent=0;
    public static void main(String[] args) {
    	
		Student Student1= new Student();
		Student1.studentname="Ashwin";
		Student1.age=20;
		Student1.gender="Male";
		Student1.dayspresent=156;
		
		System.out.println(Student1.studentname);
		System.out.println(Student1.age);
		System.out.println(Student1.gender);
		System.out.println(Student1.dayspresent);

		
		Student Student2= new Student();
		Student2.studentname="Nivashini";
		Student2.age=21;
		Student2.gender="Female";
		Student2.dayspresent=165;

		System.out.println(Student2.studentname);
		System.out.println(Student2.age);
		System.out.println(Student2.gender);
		System.out.println(Student2.dayspresent);
       
}
}