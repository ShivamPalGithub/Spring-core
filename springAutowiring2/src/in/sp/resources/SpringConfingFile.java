package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfingFile {

	@Bean
	public Address createAddr() {
		Address address = new Address();
		address.setHousno(104);
		address.setCity("indore");
		address.setPincode(542016);
		return address;

	}

	@Bean
	public Student createStu() {
		Student student = new Student();
		student.setRollno(101);
		student.setName("shivam");
		return student;

	}

	@Bean
	public Subjects createSubj() {

		Subjects subjects = new Subjects();

		List<String> subjectsList=new ArrayList<String>();
		subjectsList.add("java");
		subjectsList.add("python");
		subjectsList.add("C++");
		
		subjects.setSubjects(subjectsList);

		return subjects;

	}

}
