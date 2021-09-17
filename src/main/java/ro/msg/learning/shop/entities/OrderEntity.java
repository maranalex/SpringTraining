package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = OrderEntity.TABLE_NAME)
public class OrderEntity {
    public static final String TABLE_NAME = "OrderEntry";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "shippedFrom_id")
    private LocationEntity shippedFrom;

    @OneToOne
    @JoinColumn(name = "address_information_id", referencedColumnName = "id")
    private AddressInformationEntity addressInformation;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerEntity customer;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetailEntity> orderDetails;

    @OneToOne
    @JoinColumn(name = "revenue_id", referencedColumnName = "id")
    private RevenueEntity revenue;
}
