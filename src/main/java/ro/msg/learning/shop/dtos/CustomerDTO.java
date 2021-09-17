package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String emailAddress;
}
