package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.security.auth.login.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils factory=new SessionFactoryUtils();
        factory.init();
        Session s=factory.getSession();
        try {
            ProductDao pd=new ProductDaoImpl(factory);
            pd.findById(2l);
            System.out.println(pd);
            System.out.println(pd.findAll());
            pd.saveOrUpdate(new Product("Orange",100));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            factory.shotdown();
        }
    }
}
