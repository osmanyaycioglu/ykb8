package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Employee;

@Service
@Transactional
public class EmployeeDAOEntityManager {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.DEFAULT)
	public void insert(Employee empl) {
		em.persist(empl);
		empl.setBoy(3000);
// JAVA implemnetation
//		try {
//			em.getTransaction().begin();
//			em.persist(empl);
//			em.getTransaction().commit();
//		} catch (Exception e) {
//			em.getTransaction().rollback();
//		}
		
	}
	
	public void update(Employee empl) {
		if (em.contains(empl)) {
			em.merge(empl);
			empl.setAge(100);
		} else {
			Employee merge = em.merge(empl);
			merge.setBoy(1000);
		}
		
	}

}
