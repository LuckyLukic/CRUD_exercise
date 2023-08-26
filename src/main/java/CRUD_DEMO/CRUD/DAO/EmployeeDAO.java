package CRUD_DEMO.CRUD.DAO;

import java.util.List;

import CRUD_DEMO.CRUD.Entity.Employee;

public interface EmployeeDAO {
	
	
	List<Employee> findAll();
	
	Employee save (Employee theEmployee);

	Employee findById (int theId);
	
	void deleteById (int theId);

}
