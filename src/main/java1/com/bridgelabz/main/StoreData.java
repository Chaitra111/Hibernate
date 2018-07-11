package com.bridgelabz.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Implemetation of hibernate
 */
public class StoreData {
	public static void main(String[] args) {
		try {
			Configuration configure = new Configuration();
			configure.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configure.buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Employee emp = new Employee();
			emp.setFirstName("Medini");
			emp.setLastName("D");
			emp.setContactNo("9463467345");
			emp.setId(3);

			session.save(emp);
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
