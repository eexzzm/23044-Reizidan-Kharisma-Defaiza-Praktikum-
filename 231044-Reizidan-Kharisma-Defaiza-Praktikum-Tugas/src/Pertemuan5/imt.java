package Pertemuan5;
import java.util.Scanner;

public class imt {
    Scanner scanner = new Scanner(System.in);
    double bb, tb, imt;
    String kriteria;
    
    void hitungImt(){
        
        // Mendaftarkan informasi tubuh pengguna
        // menggunakan scanner
        System.out.println("Masukan informasi tubuh anda.");
        System.out.print("Berat Badan(kg)\t= ");
        bb = scanner.nextDouble();
        System.out.print("Tinggi Badan(m)\t= ");
        tb = scanner.nextDouble();
        
        // Perhitungan untuk menentukan
        // nilai IMT pengguna
        imt = bb / (tb*tb);
        
        // Percabangan untuk menentukan
        // kriteria badan sesuai denga nilai IMT pengguna
        if(imt < 18.5){
                kriteria = "Berat Badan Kurang";
            } else if(imt < 25){
                kriteria = "Berat Badan Ideal";
            } else if(imt < 30){
                kriteria = "Berat Badan Lebih";
            } else if(imt < 40){
                kriteria = "Gemuk";
            } else {
                kriteria = "Sangat Gemuk";
            }
        }
    
    // Menampilkan informasi lengkap tubuh pengguna
    void printDataImt(){
        System.out.println("\nBerikut informasi lengkap tentang tubuh anda.");
        System.out.println("Berat Badan\t= "+bb);
        System.out.println("Tinggi Badan\t= "+tb);
        System.out.println("Nilai IMT\t= "+imt);
        System.out.println("Kriteria Badan\t= "+kriteria);
    }
    
    
    public static void main(String[] args) {
        imt imt = new imt();
        
        System.out.println("\t--INDEKS MASSA TUBUH--\n");
        imt.hitungImt();
        imt.printDataImt();
        
        
        
    }
    
}
