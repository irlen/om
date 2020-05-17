package com.hys.service.orderDetail;

import com.hys.dataobject.OrderDetail;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderDetailImplTest {
    @Autowired
    private OrderDetailImpl detailService;
    @Test
    void findById() {
        OrderDetail orderDetail = detailService.findById("222");
        System.out.println(orderDetail);
    }

    @Test
    void findAll() {
        List<OrderDetail> orderDetailList = detailService.findAll();
        for(OrderDetail orderDetail:orderDetailList){
            System.out.println(orderDetail);

        }
    }

    @Test
    void save() {
        OrderDetail odtail = new OrderDetail();
        odtail.setDetailId("222");
        odtail.setOrderId("111");
        odtail.setProductIcon("http://haha.png");
        odtail.setProductId("333");
        odtail.setProductName("雅诗兰黛");
        odtail.setProductPrice(new BigDecimal(23.45));
        odtail.setProductQuantity(7);
        OrderDetail result = detailService.save(odtail);
        System.out.println(result);

    }

    @Test
    void findByOrderId() {
        List<OrderDetail> orderDetailList = detailService.findByOrderId("111");
        for(OrderDetail orderDetail: orderDetailList){
            System.out.println(orderDetail);
        } 
    }
}