package day14;
import java.util.Scanner;

public class MainEmp {
	public static void main(String[] args) {
		EmploymentManagement em = new EmploymentManagement();
		Scanner na = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.println("Enter your Details");
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for show");
			System.out.println("0 for exit");
			int key = na.nextInt();
			na.nextLine();
			switch (key) {
			case 1: {
			System.out.println("Enter the Employee Name:");	
			String empName = na.nextLine();
			em.setEmpName(empName);
			
			System.out.println("Enter the Employee ID:");
			int empID = na.nextInt();
			em.setEmpID(empID);
			
			System.out.println("Enter the Employee department Name:");
			String empdep= na.nextLine();
			em.setEmpdep(empdep);
			na.nextLine();
			
			System.out.println("Enter the Employees Mobile Number:");
			long empmobno = na.nextLong();
			em.setEmpmobNo(empmobno);
			break;
			}
			case 2:{
				System.out.println("Enter the Employee Name:");	
				String empName = na.nextLine();
				em.setEmpName(empName);
				
				System.out.println("Enter the Employee ID:");
				int empID = na.nextInt();
				em.setEmpID(empID);
				
				System.out.println("Enter the Employee department Name:");
				String empdep= na.nextLine();
				em.setEmpdep(empdep);
				na.nextLine();
				
				System.out.println("Enter the Employees Mobile Number:");
				long empmobno = na.nextLong();
				em.setEmpmobNo(empmobno);
				break;
			}
				
			
			case 3:{
				System.out.println(em);
				break;
				
			}
			case 0:{
				isTrue=false;
				System.out.println("Thank you for your Details!!!" );
				break;
			}
			
			
		
	}
			
	}
	}
}
