package co.moonlink.dependency_injection.controllers;

import co.moonlink.dependency_injection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService service) {
        System.out.println("MyController constructor has been called...");
        this.myService = service;
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getName();
    }

    @GetMapping("/")
    public String welcomeMessage(){
        System.out.println("MyController.welcomeMessage() has been called...");
        return "BENVENUTO NEL LOCALHOST!";
    }


}
