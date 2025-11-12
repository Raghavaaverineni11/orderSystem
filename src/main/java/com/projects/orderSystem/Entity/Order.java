package com.projects.orderSystem.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Order {

    @Id
    @Column(name="order_id")
    private int orderId;

    @Column(name="order_status")
    private String orderStatus;

    @Column(name="order_name")
    private int orderName;

}
