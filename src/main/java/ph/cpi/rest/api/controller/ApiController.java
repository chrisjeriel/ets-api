package ph.cpi.rest.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.Employee;
import ph.cpi.rest.api.service.EmployeeService;

@Controller
@RequestMapping(path="")
public class ApiController {

	@Autowired
	private EmployeeService employeeService;
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@GetMapping(path="employees")
	public @ResponseBody Iterable<Employee> getEmployees(@RequestParam(value="empName", required=false) String empName) {
		logger.info("GET: /api/employees");
		return employeeService.getEmployees(empName);
	}
	
	@GetMapping(path="employees/{id}")
	public @ResponseBody Employee getEmployee(@PathVariable("id") Long id) {
		logger.info("GET: /api/employee/{id}");
		return employeeService.getEmployee(id);
	}
	
	@PostMapping(path="employees")
	public @ResponseBody Employee saveEmployee (@RequestBody Employee employee) {
		logger.info("POST: /employees");
		logger.info("Paramenters: " + employee.toString());
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping(path="employees/{id}")
	public @ResponseBody void deleteEmployee (@PathVariable("id") Long id) {
		logger.info("DELETE: /api/employee/{id}");
		logger.info("Paramenters: " + id.toString());
		employeeService.deleteEmployee(id);
	}
	
}
