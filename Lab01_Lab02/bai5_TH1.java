
package com.mycompany.bai2_th1;
import java.io.*;
import java.util.*;


public class bai5_TH1 {
    public static int UCLN(int a, int b){
        while(a != b){ 
            if(a > b) 
                a = a - b;   
            else    
                b = b - a;   
        }
        return a;
    };
    
    public static int BCNN(int a, int b){
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = x.nextInt();
        
        System.out.print("Nhap b: ");
        int b = x.nextInt();
        
        System.out.println("UCLN cua "+a+" va "+b+" la: "+UCLN(a,b));
        System.out.println("BCNN cua "+a+" va "+b+" la: "+BCNN(a,b));
    }
}
