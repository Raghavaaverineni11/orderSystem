package com.projects.orderSystem.Service;


import com.projects.orderSystem.Entity.Menu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {


    @GetMapping("/Menu")
    public Menu getMenu(){

    }

    @PostMapping("/AddToMenu")
    public void addToMenu(){

    }

    @PostMapping("/AddtoWeekendSpecials")
    public void addWeekend()
    {

    }
}
