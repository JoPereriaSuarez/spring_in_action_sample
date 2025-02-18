package org.taco_cloud.com.demo.domain.entities;

public class Ingredient {
    
    public static enum Type{
        WRAP, 
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE,
    };

    public final String id;
    public final String name;
    public final Type type;

    public Ingredient(String id, String name, Type type)
    {
        this.id = id;
        this.name = name;
        this.type = type;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null || obj.getClass() != this.getClass())
            return false;

        Ingredient other = (Ingredient)obj;

        return (other.id == null ? this.id == null : other.id.equals(this.id));
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
