package com.jpa.jpa;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        Employee e1 = new Employee("ABC", "abc@gmail.com", "382917389");
        Employee e2 = new Employee("PQR", "pqr@gmail.com", "427864238");
        Employee e3 = new Employee("XYZ", "xyz@gmail.com", "214676471");
        
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        
        Query query = em.createQuery("DELETE FROM Employee e WHERE e.name='PQR'"); 	// JPQL
        query.executeUpdate();
        
        query = em.createQuery("SELECT e FROM Employee e"); 	// JPQL
        List<Employee> list = query.getResultList();
        list.forEach(System.out::println);
        
        et.commit();
    }
}
