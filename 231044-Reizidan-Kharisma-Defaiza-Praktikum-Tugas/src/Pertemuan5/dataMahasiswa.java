/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;

public class dataMahasiswa {
    Scanner scanner = new Scanner(System.in);
    char grade;
    String npm, nama, ket;
    double nHadir, nTugas, nUts, nUas, nAkhir; 
   
    // Method untuk mendaftarkan informasi mahasiswa
    // menggunakan scanner
    void inputData (){
        System.out.print("NPM\t\t: ");
        npm = scanner.nextLine();
        System.out.print("Nama Mahasiswa\t: ");
        nama = scanner.nextLine();
        System.out.print("Nilai Kehadiran\t: ");
        nHadir = scanner.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nTugas = scanner.nextDouble();
        System.out.print("Nilai UTS\t: ");
        nUts = scanner.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nUas = scanner.nextDouble();
    }
    
    void kalkulasiNilai(){
        // nilai rata rata
        nAkhir = (0.1 * nHadir) + (0.2 * nTugas) + (0.3 * nUts) + (0.4 * nUas);
    }
    
    /*
    Percabangan untuk menentukan grade dan keterangan
    mahasiswa sesuai dengan kriteria yang dilampirkan di modul
    */
    void grade(){
        if (nAkhir <= 45){
            grade = 'E'; ket = "KURANG SEKALI";
        } else if (nAkhir <= 55){
            grade = 'D'; ket = "KURANG";        
        } else if (nAkhir <= 65){
            grade = 'C'; ket = "CUKUP";        
        } else if (nAkhir <= 75){
            grade = 'B'; ket = "BAIK";        
        } else {
            grade = 'A'; ket = "ISTIMEWA";        
        }
    }
    
    void printData (){
        System.out.print("NPM\t\t: ");
        System.out.println(npm);
        System.out.print("Nama Mahasiswa\t: ");
        System.out.println(nama);
        System.out.print("Nilai Rata-Rata\t: ");
        System.out.println(nAkhir);
        System.out.print("Grade\t\t: ");
        System.out.println(grade);
        System.out.print("Keterangan\t: ");
        System.out.println(ket);
    }
    
    
    public static void main(String[] args) {
        dataMahasiswa dm = new dataMahasiswa();
        
        System.out.println("\t--MEMASUKAN DATA MAHASISWA--");
        dm.inputData();
        dm.kalkulasiNilai();
        dm.grade();
        System.out.println("\n\t--DATA MAHASISWA--");
        dm.printData();
    }
    
}
