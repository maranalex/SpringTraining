package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = RevenueEntity.TABLE_NAME)
public class RevenueEntity {
    public static final String TABLE_NAME = "Revenue";
    @Id
    @GeneratedValue
    private Integer id;
    //    private LocationEntity location;
    private LocalDate date;
    private BigDecimal sum;
}
