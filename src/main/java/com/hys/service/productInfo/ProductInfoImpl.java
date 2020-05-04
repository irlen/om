package com.hys.service.productInfo;

import com.hys.dataobject.ProductInfo;
import com.hys.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductInfoImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository productRepository;

    @Override
    public ProductInfo findById(String productInfoId) {
        Optional<ProductInfo> op = productRepository.findById(productInfoId);
        ProductInfo pi = op.get();
        return  pi;
    }

    @Override
    public List<ProductInfo> findAll() {
        List<ProductInfo> productInfoList = productRepository.findAll();
        return productInfoList;
    }

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        List<ProductInfo> productInfoList = productRepository.findByProductStatus(2);
        return productInfoList;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        ProductInfo result = productRepository.save(productInfo);
        return result;
    }
}
