package lab1_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestLab1_1 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	
	EntityManager em=entityManagerFactory.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Lab1_1 name1=new Lab1_1("sai");
	Lab1_1 name2=new Lab1_1("sree");
	Lab1_1 name3=new Lab1_1("nikki");
	Lab1_1 name4=new Lab1_1("baby");
	Lab1_1 name5=new Lab1_1("nikku");
	
	
	
	et.begin();
	
	em.persist(name1);
	em.persist(name2);
	em.persist(name3);
	em.persist(name4);
	em.persist(name5);
	
	em.remove(name5);
	et.commit();

}
}
