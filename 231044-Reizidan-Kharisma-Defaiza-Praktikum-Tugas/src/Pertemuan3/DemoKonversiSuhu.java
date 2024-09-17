/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author SNSV
 */
public class DemoKonversiSuhu extends KonversiSuhu2 {

    public DemoKonversiSuhu(int suhu){
        this.suhu = suhu;
    }
    
    public static void main(String[] args) {
        DemoKonversiSuhu demo = new DemoKonversiSuhu(24);
        
        demo.celciusToFahrenheit();
        demo.celciusToReamur();
        demo.fahrenheitToReamur();
        
        }
    
}
