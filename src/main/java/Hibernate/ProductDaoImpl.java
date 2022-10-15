package Hibernate;

import org.h2.engine.User;
import org.hibernate.*;

import java.util.List;

public class ProductDaoImpl implements ProductDao {

    SessionFactoryUtils sf = new SessionFactoryUtils();

    ProductDaoImpl(SessionFactoryUtils sf) {
        this.sf = sf;
    }

    @Override
    public Product findById(Long id) {
        Session session = sf.getSession();
        session.getTransaction();
        Product p = session.get(Product.class, id);
        System.out.println(p);
        session.getTransaction().commit();
        return p;
    }

    @Override
    public List<Product> findAll() {
        Session session = sf.getSession();
        session.beginTransaction();
        List<Product> p = session.createQuery("select p prom Product p ").getResultList();
        System.out.println(p);
        session.getTransaction().commit();
        return p;

    }

    @Override
    public void saveOrUpdate(Product product) {
        Session session = sf.getSession();
        session.beginTransaction();
        Product p = session.get(Product.class, product.getId());
        p.setTitle(product.getTitle());
        session.getTransaction().commit();
    }
}
