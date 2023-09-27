
package com.mycompany.bai2_th1;

import java.io.*;
import java.util.*;
public class bai4_TH1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = s.nextInt();
        
        System.out.print("Nhap y: ");
        int y = s.nextInt();
        
        System.out.println("\nTong "+x+" + "+y+" = "+(x+y));
        System.out.println("Tong "+x+" - "+y+" = "+(x-y));
        System.out.println("Tong "+x+" * "+y+" = "+(x*y));
        System.out.println("Tong "+x+" / "+y+" = "+(x/y));
    }
}
