package beans;

import java.util.List;

public class Employee {
	private int empReg;
	private String empName;
	private List<String> skills;
	public int getEmpReg() {
		return empReg;
	}
	public void setEmpReg(int empReg) {
		this.empReg = empReg;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
