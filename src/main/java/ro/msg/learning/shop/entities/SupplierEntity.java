package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = SupplierEntity.TABLE_NAME)
public class SupplierEntity {
    public static final String TABLE_NAME = "Supplier";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    //    private List<ProductEntity> products;
}
