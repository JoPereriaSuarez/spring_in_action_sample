package org.taco_cloud.com.demo.domain.entities;

public class Order {
   
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String value){
        if(!value.isEmpty())
            name = value;
    }
    private String street;
    public String getStreet(){
        return street;
    }
    public void setStreet(String value){
        street = value;
    }
    private String city;
    public String getCity(){
        return city;
    }
    public void setCity(String value){
        city = value; 
    }
    private String state;
    public String getState(){
        return state;
    }
    public void setState(String value){
        state = value;
    }
    private String zip;
    public String getZip(){
        return zip;
    }
    public void setZip(String value){
        zip = value;
    }
    private String ccNumber;
    public String getCcNumber(){
        return ccNumber;
    }
    public void SetCcNumber(String value){
        ccNumber = value;
    }
    private String ccExpiration;
    public String getCcExpiration(){
        return ccExpiration;
    }
    public void setCcExpiration(String value){
        ccExpiration = value;
    }
    private String ccCVV;
    public String getCcCVV(){
        return ccCVV;
    }
    public void setCcCVV(String value){
        ccCVV = value;
    }
}
