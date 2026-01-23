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
    List<String> DSA=Arrays.asList("two pointer","BinarySearch","bruteForce");
    List<String> Timeline=Arrays.asList("a","b","c","d");
    int arr[]={1,2,3,4,5,6,7,8,9};



}
