package emscontrollers;
import java.util.*;
import baseclasses.*;
import dao.*;
public class EMScontroller {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employeecontroller empcontroller=new Employeecontroller();
		Employeedao empdao=new Employeedao();
		while(true)
		{
			System.out.println("Enter your choice 1. Login\n 2. Register\n 3.Exit ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				login(empcontroller,empdao,sc);
				break;
			case 2:
				register(sc,empdao,empcontroller);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
					
			}
			
		}
	}
	public static void login(Employeecontroller empController, Employeedao employeeDao, Scanner read) {
		System.out.println("ENter the employee email");
		String email = read.next();
		System.out.println("ENter the employee Password");
		String password = read.next();
		Employee employee = employeeDao.findEmployeeByEmailandPassword(email,password);
		if(employee!=null)
		{
			System.out.println("Welcome to ems");
			}
		
		else {
			System.out.println("register first");
			}
	}
	public static void register(Scanner sc, Employeedao empdao,Employeecontroller empcontroller)
	{
		Employee employee=empcontroller.reademployeeinfo(sc);
		employee=empdao.saveemployee(employee);
		System.out.println("Employee saved"+employee);
	}

}
