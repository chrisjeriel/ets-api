package ph.cpi.rest.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tbl_employee")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long empId;
	
	private String empName;
	
	private String empDepartment;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public Employee(Long empId, String empName, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}*/

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}
	
}
