package org.taco_cloud.com.demo.domain.entities;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Taco {
    
    @NotNull
    @Size(min=5, message="the taco's name")
    private String name;
    @NotNull
    @Size(min=1, message="ingredients")
    private List<Ingredient> ingredients;

}
