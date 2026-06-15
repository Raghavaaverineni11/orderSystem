package com.projects.orderSystem.Entity;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Data
public class Orders {

    int orders;
    int a=10;
    int b=15;

    public void sum(int a,int b){
        System.out.println(a+b);
        System.out.println();
    }

}
