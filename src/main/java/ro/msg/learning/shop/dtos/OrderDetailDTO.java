package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OrderDetailDTO {
    private Integer id;
    private OrderDTO order;
    private ProductDTO product;
    private Integer quantity;
}
