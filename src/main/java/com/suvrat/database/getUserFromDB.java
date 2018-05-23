package com.suvrat.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suvrat.User;

public class getUserFromDB {

	public static List<User> name(String value, String FieldName) {

		SessionFactory factory = new Configuration().configure("/resources/hibernate.cfg.xml")
				.addAnnotatedClass(User.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		List<User> theUser = null;
		try {
			session.beginTransaction();
			String query = "";

			if (FieldName.equals("user_name")) {
				query = "from User u where u.userName='" + value + "'";
				System.out.println("************************");
				System.out.println(query);
				System.out.println("************************");
			} else {
				query = "from User u where u.email='" + value + "'";
			}

			theUser = session.createQuery(query).list();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return theUser;
	}

	public static void main(String[] args) {
		List<User> u = null;
		u = getUserFromDB.name("suvratd7@gmail.com", "email");

		System.out.println("************************");
		System.out.println(u.size());
		System.out.println("************************");
	}
}
