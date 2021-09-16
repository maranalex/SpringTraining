package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = ProductCategoryEntity.TABLE_NAME)
public class ProductCategoryEntity {
    public static final String TABLE_NAME = "ProductCategory";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "products_and_categories",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductEntity> products;
}
