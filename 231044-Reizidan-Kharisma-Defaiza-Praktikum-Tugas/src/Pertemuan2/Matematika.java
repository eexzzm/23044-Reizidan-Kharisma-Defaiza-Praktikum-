/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author SNSV
 */
public class Matematika implements MatematikaInterface {
    public int hasil;
    @Override
        public void pertambahan(int a, int b){
            hasil = a + b;
            System.out.println(a+" + "+b+" = "+hasil);
        }
        
    @Override
        public void pengurangan(int a, int b){
            hasil = a - b;
            System.out.println(a+" - "+b+" = "+hasil);
        }
        
    @Override
        public void perkalian(int a, int b){
            hasil = a * b;
            System.out.println(a+" * "+b+" = "+hasil);
        }
        
    @Override
        public void pembagian(int a, int b){
            hasil = a / b;
            System.out.println(a+" / "+b+" = "+hasil);
        }
    
}
