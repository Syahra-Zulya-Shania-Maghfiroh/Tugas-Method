/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author MOKLET-01
 */
public class Bebas {
    //mendefinisikan variable
    String merk_A, merk_B;
    int total_A, total_B;
    int jumlah;
    //membuat konstruktor
    void Merk (String merk_A, String merk_B) {
        this.merk_A = merk_A;
        this.merk_B = merk_B;
    }
    //penerapan method void
    void Total (int total_A, int total_B) {
        this.total_A = total_A;
        this.total_B = total_B;
    }
    //penerapan method void
    void Cetak(){
        System.out.println("Merk laptop 1 : "+merk_A);
        System.out.println("Merk laptop 2 : "+merk_B);
        System.out.println("Total laptop "+merk_A+" : "+total_A);
        System.out.println("Total laptop "+merk_B+" : "+total_B);
    }
    //penerapan method void
    int jumlah(int total_A, int total_B){
        jumlah = total_A+total_B;
        System.out.println("Total laptop adalah "+jumlah);
        return jumlah;
    }
}
