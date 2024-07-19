package com.hibernatequery;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	Session session=HibernateUtil.getSessionFactory().openSession();
    	Transaction tx=session.beginTransaction();
    	
        Employee emp= new Employee();
        emp.setName("Sakshi");
        emp.setSalary(30000);
        emp.setJob("Developer");
        
        session.save(emp);
    	
//    	TypedQuery query=session.getNamedQuery("findEmployeeByaName");
    	//TypedQuery query=session.getNamedQuery("findEmployee");
//    	query.setParameter("name","Sakshi");
//    	
//    	List<Employee> employees=query.getResultList();
//        Iterator<Employee> itr = employees.iterator();
//        while(itr.hasNext())
//        {
//        	Employee e=itr.next();
//        	System.out.println(e);
//        }
//        
//        System.out.println("add hua");
//        tx.commit();
//        session.close();

        
    }
}
