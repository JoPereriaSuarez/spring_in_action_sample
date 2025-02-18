package org.taco_cloud.com.demo.domain.entities;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;

public class Order {
   
    private long id;
    public long getId(){
        return id;
    }
    public void setId(long value){
        id = value;
    }

    @NotBlank(message="name is required")
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String value){
        if(!value.isEmpty())
            name = value;
    }
    @NotBlank(message="street is required")
    private String street;
    public String getStreet(){
        return street;
    }
    public void setStreet(String value){
        street = value;
    }
    @NotBlank(message="city is required")
    private String city;
    public String getCity(){
        return city;
    }
    public void setCity(String value){
        city = value; 
    }
    @NotBlank(message="state is required")
    private String state;
    public String getState(){
        return state;
    }
    public void setState(String value){
        state = value;
    }
    @NotBlank(message="zip is required")
    private String zip;
    public String getZip(){
        return zip;
    }
    public void setZip(String value){
        zip = value;
    }
    @CreditCardNumber(message="not valid credit card")
    private String ccNumber;
    public String getCcNumber(){
        return ccNumber;
    }
    public void SetCcNumber(String value){
        ccNumber = value;
    }
    @Pattern(regexp="(0[0-9]|1[0-2])([\\'\\/'])([1-9][0-9])", message="Format MM/YY")
    private String ccExpiration;
    public String getCcExpiration(){
        return ccExpiration;
    }
    public void setCcExpiration(String value){
        ccExpiration = value;
    }
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
    public String getCcCVV(){
        return ccCVV;
    }
    public void setCcCVV(String value){
        ccCVV = value;
    }
}
