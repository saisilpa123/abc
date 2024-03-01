package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import baseclasses.*;
import util.Util;

public class Taskdao {
	public Task savetask(Task task)
	{
		EntityManager manager=Util.entitymanager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(task);
		transaction.commit();
		return task;
		
	}

}
