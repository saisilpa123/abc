package util;

import javax.persistence.*;
public class Util {
	public static EntityManager entitymanager()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("alpha");
		return factory.createEntityManager();
	}
	

}
