package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = OrderEntity.TABLE_NAME)
public class OrderEntity {
    public static final String TABLE_NAME = "OrderEntry";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //    private LocationEntity shippedFrom;
    //    private AddressInformationEntity addressInformation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerEntity customer;
    private LocalDateTime createdAt;
}
