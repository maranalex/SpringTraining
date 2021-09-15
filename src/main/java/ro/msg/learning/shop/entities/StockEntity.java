package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = StockEntity.TABLE_NAME)
public class StockEntity {
    public static final String TABLE_NAME = "Stock";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany
    @JoinTable(
            name = "products_and_stocks",
            joinColumns = @JoinColumn(name = "stock_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductEntity> products;

    @OneToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private LocationEntity location;

    private Integer quantity;
}
