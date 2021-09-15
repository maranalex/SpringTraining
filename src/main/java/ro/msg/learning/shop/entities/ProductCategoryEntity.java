package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

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
    //    private List<ProductEntity> products;
}
