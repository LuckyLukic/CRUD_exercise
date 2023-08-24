package CRUD_DEMO.CRUD;

import java.util.List;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	Employee save (Employee theEmployee);

	Employee findById (int theId);
	
	void deleteById (int theId);

}
