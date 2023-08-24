package CRUD_DEMO.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
/*	@Bean
	public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO) {
	
		
		return runner -> {
			createEmployee(employeeDAO);
		};
	}
	
	

	private void createEmployee(EmployeeDAO employeeDAO) {
		
		System.out.println("creating new student...");
		Employee employee = new Employee("Luca", "Iannice", "luca@gmail.com");
		
		System.out.println("saving student...");
		employeeDAO.save(employee);
		
		System.out.println("student saved with id " + employee.getId());
		

		System.out.println("creating new student...");
		Employee employee2 = new Employee("Luca", "Iannice", "luca@gmail.com");
		
		System.out.println("saving student...");
		employeeDAO.save(employee2);
		
		System.out.println("student saved with id " + employee2.getId());
		
		

		System.out.println("creating new student...");
		Employee employee3 = new Employee("Luca", "Iannice", "luca@gmail.com");
		
		System.out.println("saving student...");
		employeeDAO.save(employee3);
		
		System.out.println("student saved with id " + employee3.getId());
		
		

		System.out.println("creating new student...");
		Employee employee4 = new Employee("Luca", "Iannice", "luca@gmail.com");
		
		System.out.println("saving student...");
		employeeDAO.save(employee4);
		
		System.out.println("student saved with id " + employee4.getId());
		
		} */
	
	}
