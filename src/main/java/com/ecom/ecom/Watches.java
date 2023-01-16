package com.ecom.ecom;

import org.springframework.beans.factory.annotation.Autowired;

public class Watches implements Product{
    
    private String pName;
    private String pType;
    @Autowired
    public void setpName(String pName){
        this.pName = pName;
    }
    public void setpType(String pType){
        this.pType = pType;
    }

    public void productDetails(){
        System.out.println("Name of the object is  : " + this.pName);
    }

    public void productType(){
        System.out.println("Type of Watch is : " + this.pType);
        System.out.println("                                 ");
    }
}