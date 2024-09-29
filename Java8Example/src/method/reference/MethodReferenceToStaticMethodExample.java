package method.reference;

import java.util.function.Consumer;

public class MethodReferenceToStaticMethodExample {

	/*
	 * TODO object::methodName this is the syntax three(3) types of Method Reference
	 * is available 1. Reference to static method 2. Reference to instance method of
	 * object type 3. Reference Constructor
	 */

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		// this is annonymous Implementation
		employeeService.listEmployeeFromDB()
				       .forEach(new Consumer<Employee>() {
									@Override
									public void accept(Employee emp) {
										System.out.println(emp);
						
									}
				       	});
		
		// this is lamda implementation
		employeeService.listEmployeeFromDB()
					   .forEach((empy)-> System.out.println(empy) );
		
		// this is Method Reference example 1 implementation
		employeeService.listEmployeeFromDB()
								   .forEach(MethodReferenceToStaticMethodExample::print);
		
		// this is Method Reference example 2 implementation
				employeeService.listEmployeeFromDB()
										   .forEach(System.out::println); 
		// NOTE :: println is present as method under PrintStream class and out is static variable of PrintStream and System is a class present under java.lang pkg
		
	}
	
	public static void print(Employee employee) {
		System.out.println(employee);
	}

}
