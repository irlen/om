package com.hys.service.orderMaster;

import com.hys.dataobject.OrderMaster;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderMasterImplTest {
    @Autowired
    private OrderMasterImpl orderMasterService;
    @Test
    void findById() {
        OrderMaster odr = orderMasterService.findById("111");
        System.out.println(odr);
    }

    @Test
    void findAll() {
        List<OrderMaster> orderMasterList = orderMasterService.findAll();
        for(OrderMaster orderMaster:orderMasterList){
            System.out.println(orderMaster);
        }
    }

    @Test
    void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("东方村");
        orderMaster.setBuyerName("二狗");
        orderMaster.setBuyerOpenid("irlen");
        orderMaster.setBuyerPhone("181799930003");
        orderMaster.setOrderAmount(new BigDecimal(456.22));
        orderMaster.setOrderId("111");
        orderMaster.setOrderStatus(2);
        orderMaster.setPayStatus(1);
        OrderMaster result = orderMasterService.save(orderMaster);
        System.out.println(result);
    }

    @Test
    void findByOrderStatus() {
        List<OrderMaster> orderMasterList = orderMasterService.findByOrderStatus(2);
        for(OrderMaster orderMaster:orderMasterList){
            System.out.println(orderMaster);
        }
    }
}