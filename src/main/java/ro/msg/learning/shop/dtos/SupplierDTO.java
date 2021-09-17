package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SupplierDTO {
    private Integer id;
    private String name;
}
