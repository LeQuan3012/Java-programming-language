
package com.mycompany.bai2_th1;
import java.util.*;
import java.io.*;
public class bai6_TH1 {
    
    public static boolean soNgto(int a){
        if(a==2){
            return true;
        }
        for(int i=2; i<Math.sqrt(a)+1; i++){
            if(a%i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = x.nextInt();
        System.out.println("\nCac so nguyen to nho hon "+n);
        for(int i=2; i<n; i++){
            if(soNgto(i)== true){
                System.out.print(" "+i);
            }
        }
    }
}
