package org.taco_cloud.com.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.taco_cloud.com.demo.domain.entities.Ingredient;
import org.taco_cloud.com.demo.domain.entities.Ingredient.Type;
import org.taco_cloud.com.demo.domain.entities.Taco;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
   
    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
            new Ingredient("COTO", "Corn Tortilla", Type.WRAP)
        );

        Ingredient.Type[] types = Ingredient.Type.values();
        for(Type type : types)
        {
            model.addAttribute(type.toString().toLowerCase(),
             filterByType(ingredients, type));
        }
        model.addAttribute("design", new Taco());
        return "design";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type)
    {
        return ingredients.stream()
            .filter(ingredient -> ingredient.type.equals(type))
            .collect(Collectors.toList());
    }
}
