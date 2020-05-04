package com.hys.service.productInfo;

import com.hys.dataobject.ProductInfo;

import java.util.List;
import java.util.Optional;

public interface ProductInfoService{

    ProductInfo findById(String productInfoId);


    List<ProductInfo> findAll();


    List<ProductInfo> findByProductStatus(Integer productStatus);


    ProductInfo save(ProductInfo productInfo);
}
