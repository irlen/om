package com.hys.service.productCategory;

import com.hys.dataobject.ProductCategory;

import javax.validation.constraints.Size;
import java.util.List;

public interface CategoryService {
    //查找一个
    ProductCategory findById(Integer productCategoryId);
    //查找所有
    List<ProductCategory> findAll();
    //通过类目号查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    //新增类目
    ProductCategory save(ProductCategory productCategory);
}
