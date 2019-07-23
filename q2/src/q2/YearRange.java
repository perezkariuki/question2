/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author user
 */
public class YearRange {
    public void setRangeType(){
        
       for(int year=1314;year<=2014;year++){
           if(year%14==0&&year%20==0){
            System.out.println(""+year);
           }
           
        }  
    }
    public void setrangeType(){
        System.out.println("The leap years are");
        for(int year=1100;year<=3150;year++){
           if( (year%4==0&&year%400==0)||(year%100==0&&year%400!=0) || (year%400==0)){
            System.out.println(""+year);
           }
           
        }  
    }
     public void setRangetype(){
       System.out.println("Olympic years");
       for(int year=1500;year<=1890;year++){
           if(year%3==0){
            System.out.println(""+year);
           }
           
        }  
    }
    }
    

