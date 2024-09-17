/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author SNSV
 */
public class KonversiSuhu { 
    public int suhu;
    
    void celciusToFahrenheit (){
        double hasil = ((9.0 / 5.0) * suhu) + 32;
        
        System.out.println("\tCelcius to Fahrenheit");
        System.out.println("Celcius\t\t= "+suhu);
        System.out.println("Fahrenheit\t= "+hasil+"\n");
    }
    
    void celciusToReamur (){
        double hasil = (4.0 / 5.0) * suhu;
        
        System.out.println("\tCelcius to Reamur");
        System.out.println("Celcius\t= "+suhu);
        System.out.println("Reamur\t= "+hasil+"\n");
    }
}
