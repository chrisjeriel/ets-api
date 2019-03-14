package ph.cpi.rest.api.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.model.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SqlSession sqlSession;
	
	public Iterable<Employee> getEmployees(String empName) {
		return employeeRepository.findByEmpNameIgnoreCaseContaining(empName == null? "" : empName);
	}
	
	public Employee getEmployee(Long id) {
		System.out.println("getEmployeeX");
		return sqlSession.selectOne("getEmployeeX", id);
	}

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.delete(id);
	}
}
	