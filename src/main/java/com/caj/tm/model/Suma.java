package com.caj.tm.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Suma implements Serializable{
    private String num1;
    private String num2;
    private String resultado;
    
    public String getResultado(){
        Double suma = Double.parseDouble(num1)+ Double.parseDouble(num2); 
        return suma.toString();
    }
    
}