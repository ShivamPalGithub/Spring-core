package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String  resourcesFile= "in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resourcesFile);
        Student s = (Student) context.getBean(Student.class);
//        Student s = (Student) context.getBean("stdId");
        s.display();
}
}
