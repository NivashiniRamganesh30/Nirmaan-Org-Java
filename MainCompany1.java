package day11;

public class MainCompany1 {
	public static void main(String[] args) {
		Company1 co = new Company1();
		
		
		co.setEmpName("Nivashini");
		co.setEmpId(54321);
		co.setDept("Web Developer");
		co.setMobNo(1234567321);
		
		System.out.println("Employee Name :"+co.getEmpName());
		System.out.println("Employee Id :"+co.getEmpId());
		System.out.println("Department :"+co.getDept());
		System.out.println("Mobile No :"+co.getMobNo());
	}
}	


