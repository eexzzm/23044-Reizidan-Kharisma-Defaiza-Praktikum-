/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan8;
import java.util.Scanner;
/**
 *
 * @author SNSV
 */
public class tugas {
    Scanner input = new Scanner(System.in);
    //list array dipisah tiap jenis kategori
    String[] kodeBarangArr = {"A001", "A002", "A003", "A004"};
    String[] namaBarangArr = {"Susu", "beras", "telur", "kopi"};
    String[] hargaBarangArr = {"3000", "13000", "14000", "2500"};
    String[] riwayatPesananArr = new String [10];
    int jumlahPesan, jumlahBarang, totalBayar = 0;
    String kodeBarang;
    
    void showcaseBarang(){
        System.out.println("Daftar Barang");
        
        for(int i = 0; i<kodeBarangArr.length; i++){
            System.out.print(kodeBarangArr[i]+"\t");
            System.out.print(namaBarangArr[i]+"\t");
            System.out.println(hargaBarangArr[i]);
            
        }
    }
    
    void inputFunc (){
        System.out.print("Masukan jumlah item yang ingin dibeli\t: ");
        jumlahPesan = input.nextInt();
        input.nextLine();
        
        System.out.println("");
        int dataCounter = 1;
        
        //looping input daftar barang yang ingin dibeli
        
        //dari banyak variable untuk menyimpan detil spesifikasi pesanan
        //akan disimpan lagi ke dalam satu variable untuk menyimpankan keseluruhan detil
        //variable riwayatPesanan String
        
        for(int i = 0; i<jumlahPesan; i++){
            int arrIndex = 0, total, tempInt;
            String tempStr;
            
            System.out.println("Data ke-"+dataCounter++);
            riwayatPesananArr[i] = ""; //inialisasi arr menjadi string kosong
            
            System.out.print("Masukan Kode Barang\t:");
            kodeBarang = input.nextLine();
            
            for (int j = 0; j < kodeBarangArr.length; j++){
                if(kodeBarangArr[j].equals(kodeBarang)){
                arrIndex = j;    
                }
            }
            
            riwayatPesananArr[i] += kodeBarangArr[arrIndex]+"\t     "+namaBarangArr[arrIndex]+"\t";
            
            System.out.print("Masukan Jumlah Barang\t:");
            jumlahBarang = input.nextInt();
            input.nextLine();
            riwayatPesananArr[i] += jumlahBarang+"\t"+hargaBarangArr[arrIndex]+"\t";
            
            tempInt = Integer.parseInt(hargaBarangArr[arrIndex]);
            
            total = tempInt*jumlahBarang;
            totalBayar += total;
            tempStr = Integer.toString(total);
            
            
            riwayatPesananArr[i] += "\t"+tempStr;
            System.out.println("");
        }
        System.out.println("");
        
    }
    
    void struk(){
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("=================================================================");
        for(int i = 0; i<jumlahPesan;i++){
            if(!riwayatPesananArr.equals("")){
                System.out.print((i+1)+"\t");
                System.out.println(riwayatPesananArr[i]);
            }
        }
        System.out.println("=================================================================");
        System.out.println("Total Bayar\t\t\t\t"+totalBayar);
        System.out.println("=================================================================");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tugas t = new tugas();
        
        System.out.println("=================================================================");
        t.showcaseBarang();
        System.out.println("=================================================================");
        System.out.println("");
        t.inputFunc();
        t.struk();
    }
    
}
