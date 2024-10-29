/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author Students
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
          String[] day=new String [7];
        day [0]="Sunday";
        day [1]="Monday";
        day [2]="Tuesday";
        day [3]="Wednesday";
        day [4]="Thursday";
        day [5]="Friday";
        day [6]="Saturday";
        
        //for loop
        int i = 0;
        do{
        System.out.println(day [i]);
        i++;
        } while (i<day.length);
        }





    }
    

