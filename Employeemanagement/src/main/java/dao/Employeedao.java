package dao;
import java.util.List;

import javax.persistence.*;
import util.*;
import baseclasses.*;
public class Employeedao {
	public Employee saveemployee(Employee employee)
	{
		Util util=new Util();
		EntityManager manager=util.entitymanager();
		EntityTransaction transaction = manager.getTransaction();
		if(employee.getAddress()!=null)
		{
			Address address=employee.getAddress();
			Addressdao addressdao=new Addressdao();
			address=addressdao.saveaddressinfo(address);
			employee.setAddress(address);
		}
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return employee;
		
		
	}
	public Employee findEmployeeByEmailandPassword(String email,String password)
	{
		String jpqlquery="SELECT u FROM Employee u where u.email=?1 AND u.password=?2";
		EntityManager manager=Util.entitymanager();
		Query query=manager.createQuery(jpqlquery);
		query.setParameter(1, email);
		query.setParameter(2,password);
		List listofuser=query.getResultList();
		if(listofuser!=null&&!(listofuser.isEmpty()))
		{
			return (Employee)listofuser.get(0);
		}
		return null;
		
	}
	public List<Employee> findAllEmployee() {
		String jpqlQuery="select e from Employee e where e.role=?1";
		EntityManager manager=Util.entitymanager();
		Query query=manager.createQuery(jpqlQuery);
		query.setParameter(1, "SE");
		return query.getResultList();
	}

}
