package com.hibernatequery;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	static SessionFactory sessionFactory; 
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			Properties settings=new Properties();
			settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/batch7293");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			settings.put(Environment.SHOW_SQL, "true");
			
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(com.hibernatequery.Employee.class);
			
			cfg.setProperties(settings);
			
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			
			sessionFactory=cfg.buildSessionFactory(serviceRegistry);
			
		}
		return sessionFactory;
		
	}
}