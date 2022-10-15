package Hibernate;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyers")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "products", fetch = FetchType.EAGER)
    private List<Product> product;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Buyer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
