/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

import Pertemuan2.Matematika;

public class MatematikaInheritance{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika2 m2 = new Matematika2();
        Matematika m1 = new Matematika();
        
        m1.pembagian(4, 2);
        m1.pengurangan(4, 2);
        m1.perkalian(4, 2);
        m1.pertambahan(4, 2);
        m2.Modulus(4, 2);
    }
    
}
