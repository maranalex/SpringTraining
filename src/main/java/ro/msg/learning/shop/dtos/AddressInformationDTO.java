package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddressInformationDTO {
    private Integer id;
    private String country;
    private String city;
    private String county;
}
