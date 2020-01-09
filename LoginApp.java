package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class LoginApp {
public static void main(String args[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
	Login login=(Login)ctx.getBean("login");
	System.out.println(login.getPassword()+" "+login.getUsername());

}
}
