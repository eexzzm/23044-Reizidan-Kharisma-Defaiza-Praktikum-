/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author SNSV
 */
public class NomorSatuBagianA {

    void prima(){
        int i, j;
        String nonPrima = "";
        boolean prime = true;
        
        
        System.out.println("\tBILANGAN PRIMA");
        
        System.out.println(" Output For Loop");
        System.out.print("Bilangan Prima\t\t: ");
        // mencari bilangan prima menggunakan metode brute force
        for (i = 0; i <= 20; i++){
            prime = true;
            if (i < 2){ // mengeliminasi bilangan kurang dari 2 = non prima
                prime = false;
            } else {
            // tiap bilangan akan dibagi oleh angka 2 sampai (-1 dari angka tersebut)
            // jika proses dilaksanakan dan uji coba berhasil
            // maka angka itu merupakan bukan bilangan prima
            for (j = 2; j < i; j++){ 
                if (i % j == 0){
                    prime = false;
                    nonPrima += i+" "; // menyimpan bilangan non prima
                     break;
                    }              
                }
            }
            
            // mencetak angka prima setelah dilakukan validasi
            if (prime){
                System.out.print(i+" ");
            }
        }
        
        // mencetak bilangan non prima
        System.out.println("\nBilangan Non Prima\t: "+nonPrima);
        
        // reset variable
        nonPrima = "";
        i = 0;
        
        System.out.println(" Output While Loop");
        System.out.print("Bilangan Prima\t\t: ");
        while(i <= 20){
            prime = true;
            if (i < 2){ 
                prime = false;
            } else {
                j = 2;
                while (j < i){ 
                    if (i % j == 0){
                        prime = false;
                        nonPrima += i+" ";
                        break;
                    }  
                j++;
                }
            }
            if (prime){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println("\nBilangan Non Prima\t: "+nonPrima);
        
        
        // reset variable
        nonPrima = "";
        i = 0;
        
        System.out.println(" Output Do While Loop");
        System.out.print("Bilangan Prima\t\t: ");
        do {
            prime = true;
            if (i < 2){ 
                prime = false;
            } else {
                j = 2;
                while (j < i){ 
                    if (i % j == 0){
                        prime = false;
                        nonPrima += i+" ";
                        break;
                    }  
                j++;
                }
            }
            if (prime){
                System.out.print(i+" ");
            }
            i++;
        } while(i <= 20);
        System.out.println("\nBilangan Non Prima\t: "+nonPrima);
        
    }
    public static void main(String[] args) {
        NomorSatuBagianA a = new NomorSatuBagianA();
        
        a.prima();
    }
    
}
