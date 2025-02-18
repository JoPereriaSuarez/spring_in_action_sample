package org.taco_cloud.com.demo.domain.entities;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Taco {
    
    @NotNull
    @Size(min=5, message="the taco's name")
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String value){
        name = value;
    }
    @NotNull
    @Size(min=1, message="ingredients")
    private List<String> ingredients;
    public List<String> getIngredients(){
        return ingredients;
    }
    @NotNull
    public void setIngredients(List<String> value){
        ingredients = value;
    }
}
