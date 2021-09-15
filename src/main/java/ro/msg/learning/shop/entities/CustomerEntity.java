package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = CustomerEntity.TABLE_NAME)
public class CustomerEntity {
    public static final String TABLE_NAME = "Customer";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String emailAddress;
    @OneToOne(mappedBy = "customer")
    private OrderEntity order;
}
