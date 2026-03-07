package com.jpa.MapTable;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CusPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        Customer c = new Customer(1, "Ali");
        CustomerDetails cd = new CustomerDetails(101, "9966", "Kolkata", "ali@gmail.com");
        c.setCustomerDetails(cd);
        cd.setCustomer(c);
        
        em.persist(c);
//        em.persist(cd);
        
        et.commit();
    }
}
