/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import java.util.Scanner;

/**
 *
 * @author rama
 */
public class Sequential {
    
    public static void main(String[] args) {
         System.out.println("========== Sequential Search ==========");
        String A[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Ramanda", "Tesla"};
        String cari;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Isi Data : ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("Masukan Data : ");
        cari = scan.nextLine();
        
        for (int x = 0; x < A.length; x++) {
            if(cari.equalsIgnoreCase(A[x])){
                System.out.println("Nama " + cari + " Berada Pada Index ke " + x);
                break;
                
            }
        }
        System.out.println("Ramanda Kholisandra");
    }
}
