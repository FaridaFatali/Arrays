package com.mycompany.arrays;

/**
 *
 * @author Farida Fatali
 */

/* Girilen bir dizideki tekil elemanları sıralarını bozmadan yeni bir diziye aktaran bir program yaz.
Örneğin girdi {3, 3, 87, 56, 1, 87, 3, 2} ise çıktı {3, 87, 56, 1, 2} olmalıdır. */

public class Arrays {

    public Arrays() {
    }

    public static void main(String[] args) {
        int[] intArray = {3, 3, 87, 56, 1, 87, 3, 2};
        
        int[] singular = new int[intArray.length];
        int index = 0;
        
        for(int i = 0; i < intArray.length; i++){
            boolean isSingular = true;
            for(int j = 0; j < index; j++){
                if(intArray[i] == singular[j]){
                    isSingular = false;
                    break;
                }
            }
            if(isSingular){
                singular[index] = intArray[i];
                index++;
            }
        }
        
        int[] newArray = new int[index];
        for(int i = 0; i < index; i++){
            newArray[i] = singular[i];
        }
       
        System.out.println("Girdi: ");
        for(int number : intArray){
            System.out.println(number + " ");
        }
        
        System.out.println();
        System.out.println("Çıktı: ");
        for(int number : newArray){
            System.out.println(number + " ");
        }
    }
}
