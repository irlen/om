package com.hys.service.orderDetail;

import com.hys.dataobject.OrderDetail;
import com.hys.repository.OrderDetailRepository;

import java.util.List;

public interface OrderDetailService {
    OrderDetail findById(String orderId);
    List<OrderDetail> findAll();
    OrderDetail save(OrderDetail orderDetail);
    List<OrderDetail> findByOrderId(String orderId);

}
