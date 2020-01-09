package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee emp=(Employee)ctx.getBean("emp");
		emp.setEmpName("priynak ka");;
		emp.setEmpReg(123);;
		System.out.println(emp.getEmpName()+" "+emp.getEmpReg()+" "+emp.getSkills());
		

	}

}
