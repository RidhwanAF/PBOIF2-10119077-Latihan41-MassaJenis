/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan41.massajenis;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Menghitung massa jenis kubus
 */
public class PBOIF210119077Latihan41MassaJenis {

    
    public static void main(String[] args) {
        Kubus objKubus = new Kubus();
        
        System.out.println("======Massa Jenis Kubus======");
        objKubus.setSisi(5);
        System.out.println("Sisi : "+objKubus.getSisi());
        objKubus.setMassa(250);
        System.out.println("Massa : "+objKubus.getMassa());
        System.out.println("");
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+objKubus.hitungVolume(0));
        System.out.println("Massa Jenis : "+objKubus.hitungMassaJenis(0, 0));
    }
    
}
