package Hibernate;

import java.util.List;

public interface ProductDao {

  Product findById(Long id);

  List<Product> findAll();

  void saveOrUpdate(Product product);
//
//    void update(Long id, String title, int price);

//    void testCache();

}

