package com.hys.service.orderDetail;

import com.hys.dataobject.OrderDetail;
import com.hys.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailImpl implements OrderDetailService {
    @Autowired
    private OrderDetailRepository detailService;
    @Override
    public OrderDetail findById(String orderId) {
        Optional<OrderDetail> op = detailService.findById(orderId);
        OrderDetail orderDetail = op.get();
        return orderDetail;
    }

    @Override
    public List<OrderDetail> findAll() {
        List<OrderDetail> orderDetailList = detailService.findAll();
        return orderDetailList;
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        OrderDetail odtail = detailService.save(orderDetail);
        return odtail;
    }

    @Override
    public List<OrderDetail> findByOrderId(String orderId) {
        List<OrderDetail> orderDetailList = detailService.findByOrderId(orderId);
        return orderDetailList;
    }
}
