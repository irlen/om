package com.hys.controller;

import com.hys.dataDTO.TablexDTO;
import com.hys.dataDTO.TableyForOrderMaster;
import com.hys.dataobject.OrderMaster;
import com.hys.service.orderMaster.OrderMasterImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderMasterController
{
    @Autowired
    private OrderMasterImpl orderService;
    @RequestMapping("/order/getOrderTable")
    public Map getOrderTable(){
        List<OrderMaster>  orderMasterList = orderService.findAll();
        List<TablexDTO> tablexList = new ArrayList<>();
        List<TableyForOrderMaster> tableyList = new ArrayList<>();
        tablexList.add(new TablexDTO("订单号","orderId","orderId"));
        tablexList.add(new TablexDTO("买家姓名","buyerName","buyerName"));
        tablexList.add(new TablexDTO("买家手机","buyerPhone","buyerPhone"));
        tablexList.add(new TablexDTO("买家地址","buyerAddress","buyerAddress"));
        tablexList.add(new TablexDTO("买家微信号","buyerOpenid","buyerOpenid"));
        tablexList.add(new TablexDTO("订单金额","orderAmount","orderAmount"));
        tablexList.add(new TablexDTO("订单状态","orderStatus","orderStatus"));
        tablexList.add(new TablexDTO("支付状态","payStatus","payStatus"));
        for(OrderMaster orderMaster:orderMasterList){
            TableyForOrderMaster tableyForOrderMaster = new TableyForOrderMaster();
            BeanUtils.copyProperties(orderMaster,tableyForOrderMaster);
            tableyForOrderMaster.setKey(orderMaster.getOrderId());
            tableyList.add(tableyForOrderMaster);
        }
        Map<String,Object> map = new HashMap<String,Object>(16);
        map.put("xxx",tablexList);
        map.put("yyy",tableyList);
        return map;
    }
}
