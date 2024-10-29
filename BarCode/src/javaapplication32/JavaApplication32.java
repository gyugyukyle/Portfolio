/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author Students
 */

public class JavaApplication32 {

    
    public static void main(String[] args) {
        
       Product prod1=new Product();
       prod1.Barcode=123456;
       Product prod2= new Product();
       prod2.Barcode=987654;
       
       System.out.println(prod1.Barcode);
       System.out.println(prod2.Barcode);
    }
    
}

public class Product{
    public int Barcode;
}


