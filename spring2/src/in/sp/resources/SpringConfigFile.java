package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;
@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId() {
		Student std = new Student();
		std.setName("Shivam");
		std.setRollno(102);
		std.setEmail("shivam@gmail.com");
		return std;
		
	}
	@Bean("stdobj")
	public Student stdId1() {
		Student std = new Student();
		std.setName("Shivam");
		std.setRollno(102);
		std.setEmail("shivam@gmail.com");
		return std;
		
	}

}
