
package com.mycompany.bai2_th1;
import java.io.*;
import java.util.*;
public class bai3_TH1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        String msv = x.nextLine();
        
        System.out.print("Nhap ho ten: ");
        String hoten = x.nextLine();
        
        System.out.print("Nhap tuoi: ");
        int tuoi = x.nextInt();
        
        System.out.print("Nhap nam sinh: ");
        int namsinh = x.nextInt();
        
        System.out.print("Nhap diem trung binh: ");
        float dtb = x.nextFloat();
        
        System.out.println("\nThong tin ban vua nhap");
        System.out.println("Ma sinh vien: "+msv);
        System.out.println("Ho ten: "+hoten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Nam sinh: "+namsinh);
        System.out.println("Diem trung binh: "+dtb);
    }
}
