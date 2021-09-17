package ro.msg.learning.shop.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
public class RevenueDTO {
    private Integer id;
    private LocalDate date;
    private BigDecimal sum;
}
