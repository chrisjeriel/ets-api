package ph.cpi.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ph.cpi.rest.api.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	Iterable<Employee> findByEmpNameIgnoreCaseContaining(String empName);
}
