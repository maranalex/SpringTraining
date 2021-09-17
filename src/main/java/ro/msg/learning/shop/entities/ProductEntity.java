package ro.msg.learning.shop.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Builder
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

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private StockEntity stock;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<ProductCategoryEntity> categories;

    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    private SupplierEntity supplier;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private OrderDetailEntity orderDetail;

    private String imageUrl;
}
