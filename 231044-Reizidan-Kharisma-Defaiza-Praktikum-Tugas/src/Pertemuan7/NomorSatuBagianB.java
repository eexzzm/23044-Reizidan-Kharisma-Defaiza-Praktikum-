/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author SNSV
 */
public class NomorSatuBagianB {

    void ganjilGenap(){
        System.out.println("\tGANJIL GENAP");
        String ganjil = "", genap = "";
        int i;
        
        // for loop
        for (i = 0; i <= 20; i++){
            
            if (i == 0){ // angka 0 dianggap genap
                genap += i+" ";
            } else if (i % 2 == 0){
                genap += i+" ";
            } else {
                ganjil += i+" ";
            }
        }
        
        System.out.println(" Output For Loop");
        System.out.println("Ganjil\t: "+ganjil);
        System.out.println("Genap\t: "+genap);
        
        // while loop
        ganjil = "";
        genap = "";
        i = 0;
        while (i <= 20){
            if (i == 0){ // angka 0 dianggap genap
                genap += i+" ";
            } else if (i % 2 == 0){
                genap += i+" ";
            } else {
                ganjil += i+" ";
            }
            
        i++;
        }
        System.out.println(" Output While Loop");
        System.out.println("Ganjil\t: "+ganjil);
        System.out.println("Genap\t: "+genap);

        
        // do while loop
        ganjil = "";
        genap = "";
        i = 0;
        do{
            if (i == 0){ // angka 0 dianggap genap
                genap += i+" ";
            } else if (i % 2 == 0){
                genap += i+" ";
            } else {
                ganjil += i+" ";
            }
        i++;
        }while(i <= 20);
        
        System.out.println(" Output Do While Loop");
        System.out.println("Ganjil\t: "+ganjil);
        System.out.println("Genap\t: "+genap);
        System.out.println("");
    }
    public static void main(String[] args) {
        NomorSatuBagianB b = new NomorSatuBagianB();
        b.ganjilGenap();
    }
    
}
