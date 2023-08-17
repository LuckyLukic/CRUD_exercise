package CRUD_DEMO.CRUD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import CRUD_DEMO.CRUD.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	//define entotyManager
	private EntityManager entityManager;
	
	
	//constructor injection
	
	@Autowired
	public EmployeeDAOImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Employee> findall() {
		
		TypedQuery<Employee> theQuery = entityManager.createNamedQuery("FROM Employee", Employee.class);
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}
	
	

}
