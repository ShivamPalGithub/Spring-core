package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

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
	public Address createAddr2() {
		Address address = new Address();
		address.setHousno(105);
		address.setCity("bhopal");
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


}
