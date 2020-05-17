package com.hys.controller;

import com.hys.dataobject.OrderMaster;
import com.hys.service.orderMaster.OrderMasterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderMasterController
{
    @Autowired
    private OrderMasterImpl orderService;
    @RequestMapping("/order/getOrderTable")
    public Object getOrderTable(){
        List<OrderMaster>  orderMasterList = orderService.findAll();
        return orderMasterList;
    }
}
