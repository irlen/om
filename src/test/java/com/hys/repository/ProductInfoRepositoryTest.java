package com.hys.repository;

import com.hys.dataobject.ProductInfo;
import org.junit.Assert;
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
class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository infoRepository;
    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setProductIcon("http://scxgo.com/haha.png");
        productInfo.setProductId("3333");
        productInfo.setProductName("阿玛尼aa");
        productInfo.setProductPrice(new BigDecimal(999));
        productInfo.setProductReal(new BigDecimal(559));
        productInfo.setProductStock(100);
        productInfo.setProductStatus(3);
        ProductInfo result = infoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    void findByProductStatus() {
        List<ProductInfo> pd = infoRepository.findByProductStatus(2);
        for(ProductInfo productInfo:pd){
            System.out.println(productInfo);
        }
    }
}