package emscontrollers;
import java.util.*;

import baseclasses.Address;
public class Addresscontroller {
	public Address saveaddressinfo(Scanner sc)
	{
		Address address=new Address();
		System.out.println("Enter lane");
		address.setLane(sc.next());
		System.out.println("Enter city");
		address.setCity(sc.next());
		System.out.println("Enter state");
		address.setState(sc.next());
		System.out.println("Enter country");
		address.setCountry(sc.next());
		System.out.println("Enter pincode");
		address.setPincode(sc.nextInt());
		return address;
	}

}
