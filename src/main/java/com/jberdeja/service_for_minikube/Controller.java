package com.jberdeja.service_for_minikube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    public String checkGet() {
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("Execute get");
        return "get-ok";
    }

    @PostMapping("/post")
    public String checkPost(@RequestBody String name) {
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("HAPPY CASE");
        System.out.println("Execute post");
        return name + " - ok";
    }
}