/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author SNSV
 */
public class bangunRuangRumus{
    double panjang, lebar, tinggi, sisi, hasil;

    protected double volumeBalok() {
        hasil = panjang * lebar * tinggi;
        return hasil;
    }
    
    public double volumeKubus() {
        hasil = sisi * sisi * sisi; 
        return hasil;
    }

    public double luasPermukaanBalok() {
        hasil = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        return hasil;
    }
    
    public double luasPermukaanKubus() {
        hasil = 6 * (sisi * sisi);
        return hasil;
    }
    
    
}
