package emscontrollers;
import java.util.Scanner;

import baseclasses.*;

public class Employeecontroller {
	public Employee reademployeeinfo(Scanner read)
	{
		Employee employee=new Employee();
		System.out.println("Enter name");
		employee.setName(read.next());
		System.out.println("Enter email");
		employee.setEmail(read.next());
		System.out.println("Enter password");
		employee.setPassword(read.next());
		System.out.println("Enter role");
		employee.setRole(read.next());
		Addresscontroller addresscontroller=new Addresscontroller();
		Address address=addresscontroller.saveaddressinfo(read);
		return employee;
	}

}
