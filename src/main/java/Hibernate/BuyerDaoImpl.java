package Hibernate;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BuyerDaoImpl implements BuyerDao {

    SessionFactoryUtils sf = new SessionFactoryUtils();

    BuyerDaoImpl(SessionFactoryUtils sf){
        this.sf = sf;
    }

    @Override
    public Buyer findById(Long id) {
        Session session = sf.getSession();
        session.getTransaction();
        Buyer buyer = session.get(Buyer.class, id);
        System.out.println(buyer.getId() + buyer.getName());
        session.getTransaction().commit();
        return buyer;
    }

    @Override
    public List<Buyer> findAll() {
        Session session = sf.getSession();
        session.beginTransaction();
        List<Buyer> buyers = session.createQuery("select b from Buyer b ").getResultList();
        System.out.println(buyers);
        session.getTransaction().commit();
        return buyers;

    }
}
