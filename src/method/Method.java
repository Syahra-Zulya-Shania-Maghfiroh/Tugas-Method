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
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inisialisasi objek
        Bebas objek = new Bebas();
        objek.Merk("Asus", "Hp"); //pemanggilan method void
        objek.Total(5, 8); //pemanggilan method void
        objek.jumlah(5,8); //pemanggilan method non void
        objek.Cetak(); //pemanggilan method void
        
    }
    
}
