package com.mycompany.arrays;

import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author Farida Fatali
 */
public class SieveofEratosthenes {
    public static void main(String[] args) {
        SieveofEratosthenes seo = new SieveofEratosthenes();
        System.out.println("Lutfen bir positive tam sayı girin: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seo.countNumberOfPrimesUpTo(n);
    }

    private void countNumberOfPrimesUpTo(int n) {
        long start = System.currentTimeMillis();
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);
        
        
        for(int i = 2; i <= n; i++){
            if(list[i] == true)
                for(int j = 2; i * j <= n; j++)
                    list[i * j] = false;
        }
        
        int numberOfPrimes = 0;
        for(boolean b : list){
            if(b)
                numberOfPrimes++;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(n + " sayısına kadar " + (numberOfPrimes - 2) + " tane asal sayı vardır.");
        System.out.println("Time: " + time + " ms.");
    }
    
}
