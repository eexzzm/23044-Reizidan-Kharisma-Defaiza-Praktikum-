/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author SNSV
 */
public class bangunRuangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bangunRuangTampil balok = new bangunRuangTampil(10, 5, 3);
       bangunRuangTampil kubus = new bangunRuangTampil(5);
       
       balok.tampilBalok();
       kubus.tampilKubus();
    }
    
}
