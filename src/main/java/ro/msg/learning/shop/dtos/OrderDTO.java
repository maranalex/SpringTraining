package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class OrderDTO {
    private Integer id;
    private LocationDTO shippedFrom;
    private AddressInformationDTO addressInformation;
    private CustomerDTO customer;
    private LocalDateTime createdAt;
    private RevenueDTO revenue;

}
