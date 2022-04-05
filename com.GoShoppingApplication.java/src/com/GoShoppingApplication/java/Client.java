package com.GoShoppingApplication.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = 	Persistence.createEntityManagerFactory("JavaHelps");
	
	public static void main(String[] args) 
	{
				
	
	EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction transaction = null;
	
	try {
		transaction = manager.getTransaction();
		transaction.begin();
		
		/*GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAcc(123, "Vikas", 1000, true);
	
	gssfactory.getNewNormalAcc(111, "Vikas2", 1000, 50);
		

	manager.persist(gssfactory);
	*/
		// Step 2
		
GSPrimeAcc gsprime = new GSPrimeAcc(01, "ruman", 10, false);
		gsprime.getaccNm();

		gsprime.getaccNo();
		gsprime.getCharges();

		// Step 4 / Step d.
		gsprime.bookProduct(1000);
		
		// Step 5 / Step e.

	gsprime.toString();
	
	manager.persist(gsprime);
		
		// Step 3
/*
	GSNormalAcc gsnormal = new GSNormalAcc(2, "virat", 20,50); 
		gsnormal.getaccNm();
		gsnormal.getaccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		
		// Step 4 / Step d.
		gsnormal.bookProduct(1000);
		// Step 5 / Step e.
		gsnormal.toString();
		
		manager.persist(gsnormal);
		*/

		transaction.commit();
	}catch (Exception ex) { 
		if (transaction != null) { 
			transaction.rollback();
		}
		
		ex.printStackTrace();
	}finally {
		manager.close();
		
		ENTITY_MANAGER_FACTORY.close();
		}
	}

	}
	