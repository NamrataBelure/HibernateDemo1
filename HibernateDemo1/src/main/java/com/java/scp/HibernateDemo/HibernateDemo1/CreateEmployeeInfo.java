package com.java.scp.HibernateDemo.HibernateDemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEmployeeInfo {

	public static void main(String[] args) {
		
	    SessionFactory sessionFactory = new Configuration().configure("com/java/scp/HibernateDemo/HibernateDemo1/hibernate.cfg.xml").addAnnotatedClass(EmpPoja.class).buildSessionFactory();
	    Session session = sessionFactory.getCurrentSession();
		
		System.out.println("creating Employee information....");
		EmpPoja e1= new EmpPoja(19, "raj", "solapur", 45000);
			
		Transaction tr = session.beginTransaction();
		System.out.println("Saving the Employee:");
	    System.out.println(e1);
	    session.save(e1);
		session.flush();
		session.refresh(e1);
		
	    System.out.println("refresh session...");
			
		//find out student's id :primary key
    	System.out.println("saved Employee.gernated id:"+e1.getEmpId());
	
		Session session1=sessionFactory.openSession();
		Transaction tr1=session1.beginTransaction();
		EmpPoja e11=(EmpPoja) session1.get(EmpPoja.class,e1.getEmpId());
		
		System.out.println("saved suceessfully...");
		session1.saveOrUpdate(e11);
		e11.setEmpName("nams");
		System.out.println("updated Suceessfully...");
		Session session2=sessionFactory.openSession();
		EmpPoja e2=(EmpPoja) session2.get(EmpPoja.class,10);
		session2.update(e11);
		session2.merge(e11);
		System.out.println("marge database....");
		session2.update(e11);
		System.out.println("updated sucessfully...");
		
		tr.commit();
		sessionFactory.close();
	}
}