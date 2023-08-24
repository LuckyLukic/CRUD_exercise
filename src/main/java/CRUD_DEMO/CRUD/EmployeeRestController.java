package CRUD_DEMO.CRUD;


import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
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

}
