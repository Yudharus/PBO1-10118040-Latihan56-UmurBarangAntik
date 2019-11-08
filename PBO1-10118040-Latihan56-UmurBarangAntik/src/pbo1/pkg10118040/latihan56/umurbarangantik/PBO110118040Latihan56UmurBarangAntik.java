/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan56.umurbarangantik;

/**
 *
 * @author asus
 */
public class PBO110118040Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     * NAMA  : Moch Ydha rusdian
    * KELAS : IF 1
    * NIM   : 10118040
    * Deskripsi Program : Program ini untuk membuat tampilan umur barang antik.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
