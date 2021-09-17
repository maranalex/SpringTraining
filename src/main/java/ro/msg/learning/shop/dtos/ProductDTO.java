package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDTO {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Double weight;
    private SupplierDTO supplier;
    private String imageUrl;
}
