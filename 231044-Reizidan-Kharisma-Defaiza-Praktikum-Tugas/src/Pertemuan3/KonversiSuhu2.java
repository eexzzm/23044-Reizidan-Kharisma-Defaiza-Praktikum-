/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author SNSV
 */
public class KonversiSuhu2 extends KonversiSuhu{
    
    void fahrenheitToReamur (){
        double hasil = (4.0 / 9.0) * (suhu-32);
        
        System.out.println("\tFahrenheit to Reamur");
        System.out.println("Fahrenheit\t= "+suhu);
        System.out.println("Reamur\t\t= "+hasil+"\n");
    }
}
