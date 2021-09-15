package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class CustomerEntity {
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
