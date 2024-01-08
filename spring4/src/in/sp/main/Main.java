package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student s = (Student) context.getBean("student");
        s.display();

	}

}
