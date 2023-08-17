package REST;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRUD_DEMO.CRUD.DAO.EmployeeDAO;
import CRUD_DEMO.CRUD.Entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeRestController (EmployeeDAO theEmployeeDAO) {
		
		employeeDAO = theEmployeeDAO;
	}
	
	@GetMapping("/employees")
			public List<Employee> findAll() {
				return employeeDAO.findall();
			}

}
