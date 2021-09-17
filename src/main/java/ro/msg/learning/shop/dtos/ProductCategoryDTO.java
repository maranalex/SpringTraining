package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ProductCategoryDTO {
    private Integer id;
    private String name;
    private String description;
    private List<ProductDTO> products;
}
