package ph.cpi.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import ph.cpi.rest.api.dao.EmployeeDao;
import ph.cpi.rest.api.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Iterable<Employee> getEmployees(String empName) {
		// TODO Auto-generated method stub			
		return employeeDao.getEmployees(empName);
	}

	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(id);
	}

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployee(employee);
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}

	
	
	
}
