package com.mycompany.arrays;

/**
 *
 * @author Farida Fatali
 */

// Tam bir sayının bölenlerini bulan bir program yaz. 

public class Bolunenler {
    
   
    public static void main(String[] args) {
        int sayi = 48;
        
        int[] bolenler = new int[sayi];
        int index = 0;
        
        for(int i = 1; i <= sayi; i++){
            if(sayi % i == 0){
                bolenler[index] = i;
                index++;
            }
        }
        
        System.out.println(sayi + " sayısının bölenleri bunlardır: ");
        for(int i = 0; i < index; i++){
            System.out.println(bolenler[i] + " ");
        }
    }
}
