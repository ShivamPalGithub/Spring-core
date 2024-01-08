package in.beans.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddr() {
		Address address = new Address(103, "indore", 452016);

		return address;

	}

	@Bean
	public Student createStu() {
		Student student = new Student(101, "shivam", createAddr());

		return student;

	}
}
