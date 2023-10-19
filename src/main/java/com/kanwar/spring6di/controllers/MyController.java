package com.kanwar.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

   public String gotoPath(){
        System.out.println("this is the path...");
        return "called-controller's-method-gotoPath";
    }
}
