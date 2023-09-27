package com.mycompany.bai2_th1;
import java.util.*;
import java.io.*;

public class bai7_TH1 {
    public static void nhap(int n, int a[]){
        Scanner x = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            a[i] = x.nextInt();
        }
    }
    
    public static boolean isNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void ngto(int n, int a[]){
        System.out.print("Cac so nguyen to trong mang: ");
        for(int i=0; i<n; i++){
            if (isNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    
    public static int somax(int n, int a[]){
        int max = a[0];
        for(int i=1; i<n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    
    public static int demCP(int n, int a[]){
        int dem=0;
        for(int i=0; i<n; i++){
            for(int j=1; j<Math.sqrt(a[i])+1; j++){
                if(j*j == a[i]){
                    dem++;
                }
            }
        }
        return dem;
    }
    
    public static void sapxep(int n, int a[]){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int cmp = a[i];
                    a[i]=a[j];
                    a[j]=cmp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for(int i=0; i<n; i++){
           System.out.print(" "+a[i]); 
        }
    }
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = x.nextInt();
        int a[] = new int[n];
        nhap(n,a);
        ngto(n,a);
        System.out.println("So lon nhat trong mang: "+somax(n,a));
        System.out.println("Co "+ demCP(n,a)+" so chinh phuong trong mang");
        sapxep(n,a);
    }
}
