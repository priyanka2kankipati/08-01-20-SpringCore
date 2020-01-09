package beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Student s=(Student)ctx.getBean("std");
		/*s.setRegNo(101);
		s.setStdName("priyanka");*/
		System.out.println(s.getRegNo()+" "+s.getStdName()+" "+s.getAdrr().getStreet()+" "+s.getAdrr().getCity());

	}

}
