package com.mycompany.arrays;
import java.util.Arrays;


/**
 *
 * @author Farida Fatali
 */

public class YildizliArray {
    public static void main(String[] args) {
        
// yıldırlarla içi boş dikdörtgen
//    int rows = 10;
//    int columns = 10;
//    
//    char[][] rectangle = new char[rows][columns];
//    
//    
//    for (int i = 0; i < rows; i++) {
//        for(int j = 0; j < columns; j++){
//            if(i == 0 || i == rows - 1 || j == 0 || j == columns - 1){
//                rectangle[i][j] = '*';
//            } else {
//                rectangle[i][j] = ' ';
//            }
//        }
//    }
//    
//    for(int i = 0; i < rows; i++){
//        for(int j = 0; j < columns; j++){
//            System.out.print(rectangle[i][j]);
//    }
//            System.out.println("");
//}
//    
//        System.out.println();
//        System.out.println();
        
        
// Yıldızlarla dolu üçgen
//        int rows = 10;
//        char[][] triangle = new char[rows][];
//        
//        for(int i = 0; i < rows; i++){
//            triangle[i] = new char[i + 1];
//            for(int j = 0; j <= i; j++){
//                triangle[i][j] = '*';
//            }
//        }
//        
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < triangle[i].length; j++){
//                System.out.print(triangle[i][j]);
//            }
//            System.out.println();
//        }


// Yıldızlarla ağaç - char ile
//        int rows = 10;
//        char[][] tree = new char[rows][2 * rows -1];
//        
//        for(int i = 0; i < rows; i++){
//            int starsInRows = 2 * i + 1;
//            int spacesInRows = rows - i - 1;
//            
//            for(int j = 0; j < spacesInRows; j++){
//                tree[i][j] = ' ';
//            }
//            
//            for(int j = spacesInRows; j < spacesInRows + starsInRows; j++){
//                tree[i][j] = '*';
//            }
//            
//            for(int j = spacesInRows + starsInRows; j < tree[i].length; j++){
//                tree[i][j] = ' ';
//            }
//        }
//        
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < tree[i].length; j++){
//                System.out.print(tree[i][j]);
//            }
//            System.out.println();
//        }


// Yıldızlarla ağaç - String ile
        int rows = 10;
        int columns = 19;
        String[][] tree = new String[rows][columns];
        
        for(String[] row : tree){
            Arrays.fill(row, " ");
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                tree[i][columns / 2 - i + j] = "*";
            }
        }
        
        for(String[] row : tree){
            for(String element : row){
                System.out.print(element);
            }
            System.out.println();
        }
    }
}


