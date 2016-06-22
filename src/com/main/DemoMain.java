/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;
import com.main.DemoPrintIFC;
/**
 *
 * @author admin
 */
public class DemoMain implements DemoPrintIFC {
    @Override
public void Print(){
        System.out.println("This is demo main interface");
    
}

    public DemoMain() {
        System.out.println("This is demo main");
    }

    
   
   
}
