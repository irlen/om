package com.hys.repository;

import com.hys.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    List<OrderMaster> findByOrderStatus(Integer orderStatus);
}
