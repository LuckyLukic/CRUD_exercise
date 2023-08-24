package CRUD_DEMO.CRUD;


import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	

	private EmployeeService employeeService;
	
	public EmployeeRestController (EmployeeService theEmployeeService) {
		
		employeeService = theEmployeeService;
	} 
	
	
	@GetMapping("/employees")
			public List<Employee> findAll() {
				return employeeService.findAll();
			}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee = employeeService.findById(employeeId);
		
		if(theEmployee == null) {
			throw new RuntimeException("Employee ID not found " + employeeId);
		}
		return theEmployee;
	}
	
	@PostMapping("/employees") 
		
		public Employee addEmployee(@RequestBody Employee theEmployee) {
		
			theEmployee.setId(0);
			Employee dbEmployee = employeeService.save(theEmployee);
			return dbEmployee;
			
		
	}
	} 


