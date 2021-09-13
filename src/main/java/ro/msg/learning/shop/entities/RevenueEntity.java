package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class RevenueEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private LocationEntity location;
    private LocalDate date;
    private BigDecimal sum;
}
