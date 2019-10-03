package by.pvt;

import lombok.*;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class OrderDto {

    private long orderId;
    private double price;
    private int count;
    private String comment;
    private Date date;

    public OrderDto ( int i, double v, int i1, String some_comments, Date date ){


    }
}