package com.test.testCRUD;

import com.test.testCRUD.model.Employee;
import com.test.testCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestCrudApplication.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("puttipong");
//		employee.setLastName("panomprai");
//		employee.setEmail("put@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("puttipong1");
//		employee1.setLastName("panomprai1");
//		employee1.setEmail("put1@gmail.com");
//		employeeRepository.save(employee1);
	}
}
