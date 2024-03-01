package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import baseclasses.*;
import util.Util;

public class Addressdao {
	public Address saveaddressinfo(Address address)
	{
		EntityManager manager=Util.entitymanager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(address);
		transaction.commit();
		return address;
		
	}

}
