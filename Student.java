package beans;

public class Student {
	private int regNo;
	private String stdName;
	private Address adrr;
	
	public Address getAdrr() {
		return adrr;
	}
	public void setAdrr(Address adrr) {
		this.adrr = adrr;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int regNo, String stdName, Address adrr) {
		super();
		this.regNo = regNo;
		this.stdName = stdName;
		this.adrr = adrr;
	}
	

}
