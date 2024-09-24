/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 konsep polymorphism yang dipakai di class ini
 - overloading
 - overriding
 */
public class bangunRuangTampil extends bangunRuangRumus {
  
    // implementasi overloading
    public bangunRuangTampil(double p, double l, double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    };
    
    public bangunRuangTampil(double s){
        this.sisi = s;
    };
    // implementasi overloading
    
    
    void tampilBalok(){
        System.out.println("\t--BALOK--");
        System.out.println("Panjang = "+panjang+"\nLebar = "+lebar+"\nTinggi = "+tinggi);
        System.out.print("Volume = ");
        System.out.println (super.volumeBalok()); // impelementasi overriding
        System.out.print("Luas Permukaan = ");
        System.out.println (super.luasPermukaanBalok()); // impelementasi overriding
    }
    
    void tampilKubus(){
        System.out.println("\t--KUBUS--");
        System.out.println("Sisi = "+sisi);
        System.out.print("Volume = ");
        System.out.println (super.volumeKubus()); // impelementasi overriding
        System.out.print("Luas Permukaan = ");
        System.out.println (super.luasPermukaanKubus()); // impelementasi overriding
    }
}
