package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std=(Student) context.getBean("stdId");
        std.display();
        
//        Student std=context.getBean(Student.class);
//        std.display();
//        
        Student std1=(Student) context.getBean("stdobj");
        std1.display();
	}

}
