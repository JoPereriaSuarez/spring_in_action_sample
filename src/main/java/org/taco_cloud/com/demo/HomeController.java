package org.taco_cloud.com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
   
    @GetMapping("/")
    public String get()
    {
        return "home";
    }
}
