package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = AddressInformationEntity.TABLE_NAME)
public class AddressInformationEntity {
    public static final String TABLE_NAME = "AddressInformation";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String country;
    private String city;
    private String county;
}
