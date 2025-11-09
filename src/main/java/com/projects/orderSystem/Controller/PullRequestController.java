package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Entity.Order;
import com.projects.orderSystem.Repository.OrderRepository;
import com.projects.orderSystem.Service.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PullRequestController {

    @Autowired
    Booking bookingservice;

    @Autowired
    OrderRepository  repo;

    @GetMapping("/ListAllOrders")
    public ResponseEntity<?> getAllOrder(){
        List<String> name=bookingservice.getNames();
        return ResponseEntity.ok().header("application","Json").body(name);
    }

    @GetMapping("/CheckingHttpEntity")
    public HttpEntity<String> check(){
        String a="http entity verified";
        HttpHeaders h=new HttpHeaders();
        h.add("name","verifyheader");
        return new HttpEntity(a,h);
    }

    @GetMapping("/pathvariable/{id}")
    public ResponseEntity<?> checkpath(@PathVariable("id") int id){
        return ResponseEntity.ok().body("path variable verified "+id);
    }

    @GetMapping("/param")
    public ResponseEntity<?>  question(@RequestParam("q") int a){
        return ResponseEntity.ok("the request param passed is "+a);
    }

    @GetMapping("/order_info")
    public ResponseEntity<?> get_orders(){
        List<Order> list=repo.order_info();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/addOrder")
    public ResponseEntity<?> add_orders(@RequestBody Order order){
        repo.save(order);
        return ResponseEntity.ok().body("order successfully saved");
    }







}
