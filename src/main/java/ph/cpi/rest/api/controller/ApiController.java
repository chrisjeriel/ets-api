package ph.cpi.rest.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888"})
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
	
	/*
	 * logger.info(password);
	 * 
	 * String alpha[] = {"A","B","C","D","E","F","G","H","I","J",
	 * "K","L","M","N","Ñ","O","P","Q","R","S",
	 * "T","U","V","W","X","Y","Z","a","b","c",
	 * "d","e","f","g","h","i","j","k","l","m",
	 * "n","ñ","o","p","q","r","s","t","u","v",
	 * "w","x","y","z","1","2","3","4","5","6", "7","8","9","0",":","@","-","."};
	 * 
	 * String sample1[]
	 * ={"4102","8965","7889","9635","4101","0258","8960","1020","2010","2030",
	 * "7389","0554","7385","5123","4251","3526","5253","4142","1424","3020",
	 * "4605","8962","0128","0175","5895","7895","6592","0325","8921","1452",
	 * "8932","0586","9610","5830","8205","4254","2567","5892","8369","4356",
	 * "4002","8254","4754","8792","1005","0021","0058","0089","0091","0075",
	 * "0158","0557","0558","0059","0895","0358","8951","8954","7589","7500",
	 * "0057","0858","0159","0085","0086","0087","0088","0090" };
	 * 
	 * StringBuffer ts = new StringBuffer(); ts.append("6"); for (int i = 0; i <
	 * password.length(); i++) { int alphaIndex = 0; for (String alp : alpha) { if
	 * (alp.equals(String.valueOf(password.charAt(i)))) {
	 * ts.append(sample1[alphaIndex]); } alphaIndex++; } }
	 * 
	 * 
	 * return ts.toString();
	 */
	
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
