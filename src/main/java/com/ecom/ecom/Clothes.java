package com.ecom.ecom;

import org.springframework.beans.factory.annotation.Autowired;

public class Clothes implements Product{
    private String pName;
    private String pType;
    //constructor
        @Autowired
        public void setpName(String pName){
            this.pName = pName;
        }
        public void setpType(String pType){
            this.pType = pType;
        }

        @Override
        public void productDetails(){
            System.out.println("Name of Clothes product is " +this.pName);
        }
        @Override
        public void productType(){
            System.out.println("Type of Clothes product is " +this.pType);
            System.out.println("                                 ");
        }
}