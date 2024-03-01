package onetoone_examples;
import java.util.*;
import javax.persistence.*;
public class Gstcontroller {
	public static void main(String[] args) {
		GST gst=new GST();
		gst.setGstnum(456);
		gst.setId(89);
		gst.setStatus("Approved");
		Company company=new Company();
		company.setGst(gst);
		company.setId(1234);
		company.setName("Paaru pharma solutions");
		company.setPhone(897678909);
		saveinfo(company);
	}
	public static void saveinfo(Company company)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(company.getGst());
		manager.persist(company);
		transaction.commit();
		
		
				
	}

}
