/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author SNSV
 */
public class NomorSatuBagianC {
    
    void abjad(){   
    
        System.out.println("\tHURUF ABJAD");
        
        char a;
        char b = 'A';
        System.out.print("Output For Loop\t\t: ");
        for (a = 'Z'; a >= b; a--){

            System.out.print(a+" ");
        }
        
        a = 'Z';
        System.out.print("\nOutput While Loop\t: ");
        while (a >= b){
        b = 'A';
            System.out.print(a+" ");
            a--;
        }
        
        a = 'Z';
        System.out.print("\nOutput Do While Loop\t: ");
        do{
        b = 'A';
            System.out.print(a+" ");
            a--;
        } while (a >= b);
        
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        NomorSatuBagianC c = new NomorSatuBagianC ();
        
        c.abjad();
    }
    
}
