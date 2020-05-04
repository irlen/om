package com.hys.service.productCategory;

import com.hys.dataobject.ProductCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryImplTest {
    @Autowired
    private CategoryImpl categoryService;
    @Test
    public void findById() {
        ProductCategory productCategory = categoryService.findById(2);
        System.out.println(productCategory);
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        for(ProductCategory productCategory:productCategoryList){
            System.out.println(productCategory.toString());
        }
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> ls = Arrays.asList(2,4);
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(ls);
        for(ProductCategory productCategory:productCategoryList){
            System.out.println(productCategory.toString());
        }
    }

    @Test
    public void save() throws Exception{
        ProductCategory pc = new ProductCategory();
        pc.setCategoryName("奢侈包包");
        pc.setCategoryType(4);
        categoryService.save(pc);
    }
}