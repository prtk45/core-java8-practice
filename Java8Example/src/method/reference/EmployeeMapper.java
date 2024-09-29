package method.reference;

//consider this class used as a converting employee object into employeeDTO object 
public class EmployeeMapper {
	
	public  EmployeeDTO convert(Employee employee) {
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(employee.getId());
		employeeDTO.setName(employee.getName());
		employeeDTO.setSalary(employee.getSalary());
		
		return employeeDTO;
	}

}
