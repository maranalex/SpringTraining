package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StockDTO {
    private Integer id;
    private ProductDTO product;
    private LocationDTO location;
    private Integer quantity;
}
