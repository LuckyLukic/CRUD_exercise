package CRUD_DEMO.CRUD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import CRUD_DEMO.CRUD.DAO.EmployeeDAO;
import CRUD_DEMO.CRUD.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public  EmployeeServiceImpl (EmployeeDAO theEmployeeDAO) {
		
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	public List<Employee> findAll() {
	
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		
		return employeeDAO.save(theEmployee);
	}

	@Override
	public Employee findById(int theId) {
		
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
		
	}
	
	

}
