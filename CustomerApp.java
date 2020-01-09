package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotations/SpringAnnotation.xml");
		Customer customer=(Customer)ctx.getBean("cust");
		System.out.println(customer.getCode()+" "+customer.getName()+" "+customer.getSalary().getIncome()+" "+customer.getSalary().getHra());
	}
}
