package com.projects.orderSystem.Repository;

import com.projects.orderSystem.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query(value="Select *from orders",nativeQuery = true)
    List<Order> order_info();




}
