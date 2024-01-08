package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.resources.SpringConfigFile;
import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
				Student std = (Student) context.getBean(Student.class);
				std.display();
	}
}
