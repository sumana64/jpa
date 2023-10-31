import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.PayanaEntity;

public class DeleteRunner {

	public static void main(String[] args) {
		
		    EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		     EntityManager manager =  factory.createEntityManager();
	
		     PayanaEntity entity =  manager.find(PayanaEntity.class, 4);
		     
		     System.out.println(entity);
		     
		     if(entity!=null) {
		     
		     EntityTransaction transaction = manager.getTransaction();
		     
		     transaction.begin();
		     
		     manager.remove(entity);
		     
		     transaction.commit();
		     
		     manager.close();
		     
		     }else {
		    	 
		    	 System.out.println("entity is null");
		     }
	
	}

}
