package org.taco_cloud.com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.taco_cloud.com.demo.domain.entities.Order;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderTacoController {
    
    @GetMapping("/current")
    public String orderForm(Model model){
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping()
    public String processOrder(@ModelAttribute("order") Order order, Errors errors) {
        log.info("order submitted: "+order.getName());
        return "redirect:/";
    }
    
}
