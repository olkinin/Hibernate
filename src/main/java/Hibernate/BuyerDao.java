package Hibernate;

import java.util.List;

public interface BuyerDao {

    Buyer findById(Long id);

    List<Buyer> findAll();


}

