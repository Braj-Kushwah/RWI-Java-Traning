package com.Hibernate.ImageUploadInHib;

import java.io.FileInputStream;

// import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Work is Runing On");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Employee em = new Employee();
        em.setName("Sneha");
        em.setCity("Raipur");
        em.setOpen(true);
        em.setX(1);

        FileInputStream is = new FileInputStream("D:\\RailWorld India Pvt Ltd\\Online Traning Classes\\RWI-Java-Traning\\Hibernate Tutorial\\demo\\src\\main\\java\\dhoni.jpeg");
        byte[] img = new byte[is.available()];
        is.read();
        em.setImage(img);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(em);
        tx.commit();
        session.close();
        System.out.println("image uploaded");

        is.close();
    }
}
