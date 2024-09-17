/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author SNSV
 */
public class Bingo {
String gesture;
// konstruktor kita manfaatkan untuk menentukan gestur 
// yang akan kita gunakan untuk menyanyikan bait B-I-N-G-O
    public Bingo(String gesture){
        this.gesture = gesture;
    }
    
    public void bingoLoop (){
        
    for (int i = 0; i <= 5; i++){
        System.out.println("There was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int j = 0; j < 5; j++ ){
            if(i<=0){
                System.out.println("B-I-N-G-O");
            }
            else if(i<=1){
                System.out.println(gesture+"-"+"I-N-G-O");
            }
            else if(i<=2){
                System.out.println(gesture+"-"+gesture+"-"+"N-G-O");
            }
            else if(i<=3){
                System.out.println(gesture+"-"+gesture+"-"+gesture+"-"+"G-O");
            }
            else if(i<=4){
                System.out.println(gesture+"-"+gesture+"-"+gesture+"-"+gesture+"-"+"O");
            }
            else{
                System.out.println(gesture+"-"+gesture+"-"+gesture+"-"+gesture+"-"+gesture); 
            }
        }
        System.out.println("And Bingo was his name-o.\n");
    }
    }
}
