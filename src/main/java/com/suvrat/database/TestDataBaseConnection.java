package com.suvrat.database;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.*;
import com.suvrat.User;

public class TestDataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("/resources/hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("Creating User");
			User u = new User();
			u.userName = "suvrat12";
			u.firstName = "suvrat";
			u.lastname = "Dharmadhikari";
			u.email = "s@gmail.com";
			u.password = "1234";
			
			System.out.println("Transaction");
			session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {

		}

	}

}
