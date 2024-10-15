/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author SNSV
 */
public class NomorDua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n = 10;
        
        for (int i = 0; i <= n; i++){
            if (i == 0){
                System.out.print("\t");
            } else {
                System.out.print(i+"\t");
            }
            for (int j = 1; j <= n; j++){
            if (i == 0){
                System.out.print(j+"\t");
            } else {
                    System.out.print((i*j)+"\t");
                }
            }
            System.out.println("");
        }
    }
    
}
