/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabung;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Tabung {
int r , t;
double hasil,phi = 3.14;
void input(){
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Masukkan Jari-jari = ");
    r = scan.nextInt();
    System.out.println("Masukkan Tinggi = ");
    t = scan.nextInt();
}
void hitung (){
    hasil = (phi * r * r)* t;
    System.out.println("Jari - jari = "+r);
    System.out.println("Tinggi = ");
    System.out.println("Rumus Volume Tabung = (phi * r * r)* t ");
    System.out.println("                    = 3,14 *"+r+"*"+r+"*"+t);
    System.out.println("                    = "+hasil);
}
void hasil (){
    System.out.println(" ");
    System.out.println("____________________");
    System.out.println("Volume Tabung = "+hasil);

}

        
    }