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
public class Binary {
    
    public static void main(String[] args) {
        System.out.println("========== Binary Search ==========");
        Scanner scan = new Scanner(System.in);
        int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari;
        int LastIndex = data.length - 1;
        int FirstIndex = 0;
        int flag = 0;
        int point = 0;
        
        System.out.print("Isi data adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("Masukan Data : ");
        cari = scan.nextInt();
                
        while((FirstIndex <= LastIndex) && (flag == 0)){
            point = (LastIndex + FirstIndex) / 2;
            System.out.println("Index point : "+ point);
            
            if(data[point] == cari){
                flag += 1;
                System.out.println("Data "+cari+" telah ditemukan pada index ke - "+ point);
            }
            
            else if(cari < data[point]){
                    System.out.println("Cari di Kiri");
                    LastIndex = point - 1;
         
            }
            else {
                    System.out.println("Cari di kanan");
                    FirstIndex = point + 1;
   
                }
               
            }
        
         if(flag == 1){
            System.out.println("Data "+cari+" telah ditemukan pada index ke "+ point + " baris ke "+ (point + 1));
             System.out.println("Kesimpulan : data ditemukan");
        } else {
            System.out.println("Kesimpulan : data tidak ditemukan");
     
        }
         System.out.println("");
        System.out.println("Ramanda Kholisandra");
        
        }
    }       

