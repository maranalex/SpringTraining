package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = ProductEntity.TABLE_NAME)
public class ProductEntity {
    public static final String TABLE_NAME = "Product";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Double weight;

    @ManyToMany(mappedBy = "products")
    private List<StockEntity> stocks;
    //    private List<ProductCategoryEntity> categories;
    //    private List<SupplierEntity> supplier;
    private String imageUrl;
}
