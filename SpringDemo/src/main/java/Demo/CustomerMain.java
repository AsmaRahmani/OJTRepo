package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		context.getBean("Repo");
		
		CustomerRepo Repo = (CustomerRepo)context.getBean("Repo"); 
		Repo.add();
		
					}

}
