/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Date;

/**
 *
 * @author 1894830
 */
public class customer extends superclass{
    String name;
    String location;
    
    public customer( String name, String location) {
       
        super(name, location);
    }  
    void setName(String Name) {
        name=Name ;
    }

    void setAddress(String Location) {
         location=Location ;
    }
    String getName(String Name) {
        return name ;
    }

    String getAddress(String Location ) {
         return location;
    }
}
