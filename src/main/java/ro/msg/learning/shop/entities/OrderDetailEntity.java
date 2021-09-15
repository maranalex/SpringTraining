package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = OrderDetailEntity.TABLE_NAME)
public class OrderDetailEntity {
    public static final String TABLE_NAME = "OrderDetail";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //    private OrderEntity order;
    //    private ProductEntity product;
    private Integer quantity;
}
