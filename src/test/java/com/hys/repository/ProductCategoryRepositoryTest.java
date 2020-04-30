package com.hys.repository;

import com.hys.dataobject.ProductCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


import javax.validation.constraints.Null;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByIdTest(){
        Optional<ProductCategory> op = repository.findById(1);
        System.out.println(op.get().toString());
    }
    @Test
    public void saveTest(){
        ProductCategory pc = new ProductCategory();
        pc.setCategoryName("面霜");
        pc.setCategoryType(2);
        repository.save(pc);
    }
}