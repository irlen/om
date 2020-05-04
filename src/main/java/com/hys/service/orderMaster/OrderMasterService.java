package com.hys.service.orderMaster;

import com.hys.dataobject.OrderMaster;

import java.util.List;

public interface OrderMasterService {
    OrderMaster findById(String orderId);

    List<OrderMaster> findAll();

    OrderMaster save(OrderMaster orderMaster);

    List<OrderMaster> findByOrderStatus(Integer orderStatus);
}
