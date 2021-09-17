package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LocationDTO {
    private Integer id;
    private String name;
    private AddressInformationDTO addressInformation;
}
