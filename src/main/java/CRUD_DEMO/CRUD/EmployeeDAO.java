package CRUD_DEMO.CRUD;

import java.util.List;

public interface EmployeeDAO {
	
	
	List<Employee> findAll();
	
	Employee save (Employee theEmployee);

	Employee findById (int theId);
	
	void deleteById (int theId);

}
