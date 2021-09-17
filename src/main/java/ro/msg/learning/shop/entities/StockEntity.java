package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = StockEntity.TABLE_NAME)
public class StockEntity {
    public static final String TABLE_NAME = "Stock";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(
            name = "product_id", referencedColumnName = "id")
    private ProductEntity product;

    @OneToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private LocationEntity location;

    private Integer quantity;
}
