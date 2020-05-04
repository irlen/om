package com.hys.service.productCategory;

import com.hys.dataobject.ProductCategory;
import com.hys.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryImpl implements CategoryService{
    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public ProductCategory findById(Integer productCategoryId) {
        Optional<ProductCategory>  op = Optional.ofNullable(repository.findById(productCategoryId)).orElseGet(null);
        return op.get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
