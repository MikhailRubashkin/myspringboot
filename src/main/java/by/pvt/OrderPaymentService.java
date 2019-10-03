package by.pvt;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderPaymentService {

    public List<OrderDto> getAllOrders(int maxCount) {
        List<OrderDto> list = new ArrayList<>(maxCount);
        for (int i = 0; i < maxCount; i++) {
            list.add(new OrderDto(i, Math.random() * 100, i, "Some comments", new Date()));
        }
        return list;
    }

    public OrderDto getOrderById(int orderId) {
        // repo
        // repo.find ...
        // pojo -> dto
        return new OrderDto(1, Math.random() * 100, 1, "Some comments 1", new Date());
    }

    public void createNewOrder(OrderCmd newOrderCmd) {
        //new pojo
        // set properties
        // saved
    }
}