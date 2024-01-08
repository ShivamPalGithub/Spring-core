package in.beans.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddr() {
		Address address = new Address();
		address.setHousno(103);
		address.setCity("indore");
		address.setPincode(542016);
		return address;

	}

	@Bean
	public Student createStu() {
		Student student = new Student();
		student.setRollno(101);
		student.setName("shivam");
		student.setAddress(createAddr());
		return student;

	}
}
