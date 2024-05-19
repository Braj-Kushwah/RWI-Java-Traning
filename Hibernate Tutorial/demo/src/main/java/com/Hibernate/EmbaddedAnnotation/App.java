package com.Hibernate.EmbaddedAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Employees emp = new Employees();
        emp.setEmpName("Dhoni");
    	emp.setDesgn("Captain");

        Bank bank=new Bank();
    	bank.setBid(121);
    	bank.setbName("RBL");
    	emp.setBank(bank);

    	Employees emp1=new Employees();
     	emp1.setEmpName("Kohli");
     	emp1.setDesgn("Selfish Player");
     	
     	Bank bank1=new Bank();
     	bank1.setBid(120);
     	bank1.setbName("WorldBank");
     	emp1.setBank(bank1);

        Session session=factory.openSession();
        Transaction  tx=session.beginTransaction();
        session.save(emp);
        session.save(emp1);

        tx.commit();
        session.close();
        factory.close();
    }
}