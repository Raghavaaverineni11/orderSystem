package com.projects.orderSystem.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.*;

@Entity
@Table(name="menu")
public class Menu {

    public String name;

    List<String> menuitems = new ArrayList<>();

    {
        menuitems.add("BreakFast");
        menuitems.add("Lunch");
        menuitems.add("Dinner");
    }



}
