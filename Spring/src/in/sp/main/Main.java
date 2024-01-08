package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"

		 try {
	            String config_loc = "in/sp/resources/applicationContext.xml";
	            ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
	            Student s = (Student) context.getBean("stdId");
	            s.display();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}

}
