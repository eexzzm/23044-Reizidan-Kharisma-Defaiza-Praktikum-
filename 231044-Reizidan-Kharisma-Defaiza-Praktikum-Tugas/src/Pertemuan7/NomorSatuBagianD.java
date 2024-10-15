/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan7;

public class NomorSatuBagianD {
    
    void ayam(){
        System.out.println("\tANAK AYAM");
        System.out.println("");
        
        // sebuah variable tanda
        // apakah pada akhir suatu perulangan perlu new line
        // apakah lirik yang bukan menghitung mundur ekor ayam perlu di-print
        int flag = 1;
        
        for(int i = 6; i > 0; i--){

         if(flag % 2 != 0){
            for(int j = 0; j < 2; j++){
                    System.out.println("Tek-kotek-kotek-kotek");
                    System.out.println("Anak ayam turun berkotek");
            }
                System.out.println("");
        }

            // lirik ayam paling akhir dimulai ketika ayam tersisa dua ekor
            if (i <= 2){
                if(flag % 2 == 0){
                    System.out.println("Anak ayam turunlah "+i);
                    System.out.println("Mati satu tinggalah induk");
                    flag++;
                } else {
                    System.out.println("Anak ayam turunlah "+i);
                    System.out.println("Mati satu, tinggallah "+ (i - 1));
                    flag++;
                }
                
            } else if(flag % 2 == 0){ // lirik hitung mundur ayam baris ke empat perlu new line
                System.out.println("Anak ayam turunlah "+i);
                System.out.println("Mati satu, tinggallah "+ (i - 1));
                System.out.println("");
                flag++;
            } else {
                System.out.println("Anak ayam turunlah "+i);
                System.out.println("Mati satu, tinggallah "+ (i - 1));
                flag++;
            }
            
    }
    
    }
    
    public static void main(String[] args) {
        NomorSatuBagianD satu = new NomorSatuBagianD();
        
        satu.ayam();
    }
    
}
