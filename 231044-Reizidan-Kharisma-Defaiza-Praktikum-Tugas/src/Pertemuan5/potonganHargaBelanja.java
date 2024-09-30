/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;


public class potonganHargaBelanja {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diskon;
        String diskonStr;
        
        // Memasukan informasi angka
        // belanja pelanggan menggunakan scanner
        System.out.println("-----------------------------------------------");
        System.out.print("Masukan total belanja\t\t= Rp. ");
        double belanjaAwal = scanner.nextInt();
        System.out.println("-----------------------------------------------");
        
        // Percabangan untuk menentukan
        // seberapa besar diskon yang didapatkan pelanggan
        if (belanjaAwal < 50000){
                diskon = 0.05;
                diskonStr = "5%";
            } else {
                diskon = 0.20;
                diskonStr = "20%";
            }
      
        double totalDiskon = belanjaAwal * diskon;
        double belanjaAkhir = belanjaAwal - totalDiskon;
        
        System.out.println("\n\t--STRUK BELANJA--");
        System.out.println("Total Belanja\t\t\t= Rp. "+belanjaAwal);
        System.out.println("Diskon\t\t\t\t= "+diskonStr);
        System.out.println("Potongan Harga\t\t\t= Rp. "+totalDiskon);
        System.out.println("Jumlah yang harus dibayar\t= Rp. "+belanjaAkhir);
        
        }
        
        
}
