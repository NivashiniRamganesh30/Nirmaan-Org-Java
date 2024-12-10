package day14;

public class EmploymentManagement {
	private String empName;
	private int empID;
	private String empdep;
	private long empmobNo;
	
	public EmploymentManagement(String empName,int empID,String empdep,long empmobNo) {
		this.empName=empName;
		this.empID=empID;
		this.empdep=empdep;
		this.empmobNo=empmobNo;
	}
	
	public EmploymentManagement() {
		
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpdep() {
		return empdep;
	}
	public void setEmpdep(String empdep) {
		this.empdep = empdep;
	}
	public long getEmpmobNo() {
		return empmobNo;
	}
	public void setEmpmobNo(long empmobNo) {
		this.empmobNo = empmobNo;
	}
	@Override
	public String toString() {
		return "EmploymentManagement [empName=" + empName + ", empID=" + empID + ", empdep=" + empdep + ", empmobNo="
				+ empmobNo + "]";
	}
	
	

}
