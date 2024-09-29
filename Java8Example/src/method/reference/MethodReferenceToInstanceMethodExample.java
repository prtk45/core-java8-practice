package method.reference;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceToInstanceMethodExample {

	public static void main(String args[]) {
		
		EmployeeService employeeService = new EmployeeService();
		
		// this is annonymous Implementation
		List<EmployeeDTO> listEmployeeService = employeeService.listEmployeeFromDB()
					   .stream()
					   .map(new Function<Employee, EmployeeDTO>() {

						@Override
						public EmployeeDTO apply(Employee employee) {
							EmployeeDTO employeeDTO = new EmployeeDTO();
							employeeDTO.setId(employee.getId());
							employeeDTO.setName(employee.getName());
							employeeDTO.setSalary(employee.getSalary());
							return employeeDTO;
						}
					}).collect(Collectors.toList());
		
		
		System.out.println(listEmployeeService);
		System.out.println("===========================");
		// this is lamda implementation
		
		List<EmployeeDTO> listEmployeeServiceLamda = employeeService.listEmployeeFromDB()
					   .stream()
					   .map((employee) -> {
							EmployeeDTO employeeDTO = new EmployeeDTO();
							employeeDTO.setId(employee.getId());
							employeeDTO.setName(employee.getName());
							employeeDTO.setSalary(employee.getSalary());
							return employeeDTO;
					   	}
					    ).collect(Collectors.toList());
				
		System.out.println(listEmployeeServiceLamda);
		
		// this is lamda implementation Shorter Form 
		System.out.println("===========================");
		EmployeeMapper employeeMapper = new EmployeeMapper();
		List<EmployeeDTO> listEmployeeServiceLamdaShort = employeeService.listEmployeeFromDB()
					   .stream()
					   .map(e->employeeMapper.convert(e)) 
					   .collect(Collectors.toList());
		
		System.out.println(listEmployeeServiceLamdaShort);
		
		// this is Method Reference example 1 implementation
				System.out.println("===========================");
				List<EmployeeDTO> listEmployeeServiceMethodRefer1 = employeeService.listEmployeeFromDB()
							   .stream()
							   .map(employeeMapper::convert) // this is instance method reference
							   .collect(Collectors.toList());
				
				System.out.println(listEmployeeServiceMethodRefer1);
				
		// print list of all employee name with Method Reference
		System.out.println("=========with lamda==================");
		System.out.println(
				employeeService.listEmployeeFromDB()
						.stream()
						.map(e-> e.getName())
						.collect(Collectors.toList())
		);
		System.out.println("=========with Method References==================");
		System.out.println(
				employeeService.listEmployeeFromDB()
						.stream()
						.map(Employee::getName) // if a method does not have a argument then only we can call this way
						.collect(Collectors.toList())
		);
		
		
	}
	
}
