package lk.ijse.service;

import lk.ijse.customObj.OrderResponse;
import lk.ijse.dto.impl.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    void saveOrder(OrderDTO orderDTO);
    OrderResponse getSelectedOrder(int id);
    List<OrderDTO> getAllOrders();
}
