/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

// Reizidan Kharisma

public class Mahasiswa {
    String nama;
    public void membaca (){
        System.out.println(nama+" sedang membaca");
    }
    
    public void mencontek (){
        System.out.println(nama+" mencontek");
    }
    
    public void modifikasi (String nama){
        this.nama = nama;
    }
}
