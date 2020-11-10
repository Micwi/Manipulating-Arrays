/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg1;


/**
 *
 * @author louiejr.
 */
public class A extends CSCI260Assignment1 {
    public void x(){
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum Value = " + c);
    }
    public static int minFunction(int n1, int n2){
        int min;
        
        if(n1 > n2){
            min = n2;
            
        }
        else{
            min = n1;
            
        }
        return min;
    }
}
