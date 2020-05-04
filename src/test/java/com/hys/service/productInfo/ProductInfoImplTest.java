package com.hys.service.productInfo;

import com.hys.dataobject.ProductInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class ProductInfoImplTest {
    @Autowired
    private ProductInfoImpl productService;
    @Test
    void findById() {
        ProductInfo pt = productService.findById("11111111");
        System.out.println(pt.toString());
    }

    @Test
    void findAll() {
        List<ProductInfo> productInfoList = productService.findAll();
        for(ProductInfo productInfo:productInfoList){
            System.out.println(productInfo.toString());
        }
    }

    @Test
    void findByProductStatus() {
        List<ProductInfo> productInfoList = productService.findByProductStatus(2);
        for(ProductInfo productInfo:productInfoList){
            System.out.println(productInfo.toString());
        }
    }

    @Test
    void save() {
        ProductInfo pt = new ProductInfo();
        pt.setProductStock(111);
        pt.setProductReal(new BigDecimal(12));
        pt.setProductPrice(new BigDecimal(100));
        pt.setProductName("大粉水");
        pt.setProductId("22222");
        pt.setProductIcon("http://hhaahhaha.png");
        pt.setCategoryType(4);
        pt.setProductStatus(2);
        pt.setProductDescription("这是一款卸妆水");
        ProductInfo result = productService.save(pt);
        System.out.println(result);
    }
}