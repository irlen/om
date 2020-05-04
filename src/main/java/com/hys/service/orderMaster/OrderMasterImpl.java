package com.hys.service.orderMaster;

import com.hys.dataobject.OrderMaster;
import com.hys.repository.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderMasterImpl implements OrderMasterService {
    @Autowired
    private OrderMasterRepository repository;
    @Override
    public OrderMaster findById(String orderId) {
        Optional<OrderMaster> op = repository.findById(orderId);
        OrderMaster orderMaster = op.get();
        return orderMaster;
    }

    @Override
    public List<OrderMaster> findAll() {
        List<OrderMaster> orderMasterList = repository.findAll();
        return orderMasterList;
    }

    @Override
    public OrderMaster save(OrderMaster orderMaster) {
        return repository.save(orderMaster);
    }

    @Override
    public List<OrderMaster> findByOrderStatus(Integer orderStatus) {
        List<OrderMaster> orderMasterList = repository.findByOrderStatus(orderStatus);
        return orderMasterList;
    }
}
