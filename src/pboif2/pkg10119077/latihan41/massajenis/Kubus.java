/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan41.massajenis;

/**
 *
 * @author RAF
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi(){
        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
      return parSisi = sisi * sisi * sisi;
    }
    public int hitungMassaJenis(int parMassa, int volume){
       volume = hitungVolume(sisi);
       return parMassa = massa / volume;
    }
}
