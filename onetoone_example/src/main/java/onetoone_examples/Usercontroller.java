package onetoone_examples;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Usercontroller {
	public static void main(String[] args) {
		User user=new User();
		user.setUserid(101);
		user.setUsername("Silpa");
		user.setUsermail("silpa@gmail.com");
		user.setUserpassword("Silpaa");
		user.setUserphone(788);
		
		Pan pan=new Pan();
		pan.setPanId(123);
		pan.setFathername("Swami");
		pan.setPanname("Sai Silpa");
		pan.setPannum("899");
		user.setPan(pan);
		user=saveuser(user);
		System.out.println("Data saved");
	}
	public static User saveuser(User user)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user.getPan());
		manager.persist(user);
		transaction.commit();
		return user;
	}

}
