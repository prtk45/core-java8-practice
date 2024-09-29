package java8examples;

import java.util.Arrays;
import java.util.List;

public class SampleInheritance {
	public String empName;
	public String empId;

	
	public SampleInheritance(String empName, String empId) {
		this.empId = empId;
		this.empName = empName;
	}

	public static void main(String args[]) {

		SampleInheritance s1 = new SampleInheritance("Test", "123");
		SampleInheritance s2 = new SampleInheritance("Test2", "1234");

		
		List<SampleInheritance> list1 = Arrays.asList(s1,s2);
		System.out.println(list1);

	}
}


