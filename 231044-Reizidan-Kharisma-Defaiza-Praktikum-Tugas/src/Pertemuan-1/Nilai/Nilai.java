/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nilai;

/**
 *
 * @author SNSV
 */
public class Nilai {
double nAbsen, nTugas, nUts, nUas, akhir;
String nim, nama;

    public Nilai(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void nilai(double nAbsen, double nTugas, double nUts, double nUas){
    this.nAbsen = nAbsen;
    this.nTugas = nTugas;
    this.nUts = nUts;
    this.nUas = nUas;
    
    akhir = (nAbsen * 0.10)+(nTugas * 0.20)+(nUts * 0.30)+(nUas * 0.40);
    }
    
    public void cetakNilai(){
        System.out.println("NIM\t: "+nim);
        System.out.println("Nama\t: "+nama);
        System.out.println("Nilai Absen\t: "+nAbsen);
        System.out.println("Nilai Tugas\t: "+nTugas);
        System.out.println("Nilai UTS\t: "+nUts);
        System.out.println("Nilai UAS\t: "+nUas);
        System.out.println("Nilai Akhir\t: "+akhir);
    }
    
}
