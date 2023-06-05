package com.mycompany.arrays;

/**
 *
 * @author Farida Fatali
 */

/*
Bir tam sayının asal bölenlerini bulan bir program yaz. 
Fundamental Theorem of arithmetic kullanarak
*/

public class AsalBolenler {
    public static void main(String[] args) {
        int sayi = 17248;
        int yeniSayi = sayi;
        
        System.out.print(sayi + " = ");
        
        for(int i = 2; i <= sayi; i++){
            int bolenSayisi = 0;
            while(yeniSayi % i == 0){
                bolenSayisi++;
                yeniSayi /= i;
            }
            if(bolenSayisi > 0){
                System.out.print(i);
                if(bolenSayisi > 1){
                    System.out.print("^" + bolenSayisi);
                }
                if(yeniSayi != 1){
                    System.out.print(" * ");
                }
            }
        }
    }
}
