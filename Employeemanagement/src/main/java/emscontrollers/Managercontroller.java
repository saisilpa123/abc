package emscontrollers;

import baseclasses.*;
import java.util.List;
import java.util.Scanner;
import dao.*;
import emscontrollers.*;
 
public class Managercontroller {
	public void operation(Scanner read) {
		while(true) {
			System.out.println("select choice:-\n1.create task\n2.display all employee\n3.exit");
			int choice=read.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				displayEmployee();
				break;
			case 3:
 
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
 
	private void displayEmployee() {
		
		Employeedao employeeDao=new Employeedao();
		List<Employee> employees=employeeDao.findAllEmployee();
		System.out.println("employee info");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}