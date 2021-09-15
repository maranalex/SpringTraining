package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = LocationEntity.TABLE_NAME)
public class LocationEntity {
    public static final String TABLE_NAME = "Location";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToOne
    @JoinColumn(name = "address_information_id")
    private AddressInformationEntity addressInformation;

    @OneToOne(mappedBy = "location")
    private StockEntity stock;
}
