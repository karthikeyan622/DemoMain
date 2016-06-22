/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

/**
 *
 * @author admin
 */
public class OutputHelper {
    DemoPrintIFC demoprintifc;

    public DemoPrintIFC getDemoprintifc() {
        return demoprintifc;
    }

    public void tets(){
        demoprintifc.Print();
    }

    public OutputHelper() {
    }

    public OutputHelper(DemoPrintIFC demoprintifc) {
        this.demoprintifc = demoprintifc;
    }
    
    
    
}
