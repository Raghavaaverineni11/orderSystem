package com.projects.orderSystem.Service;


import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Data
public class Booking {


    List<String> names= Arrays.asList("raghava","rakesh","Ajay","vadina","nani","ashwitha");
    List<String> orderSrtatus =Arrays.asList("Delivered","IN the Way","Shipped","Dispatched");



}
