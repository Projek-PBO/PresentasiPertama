/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

/**
 *
 * @author ASUS
 */
public class Tembereng extends Bola{
    public double luasPermukaanTembereng;
    public double tinggiTembereng;
    public double volumeTembereng;
    public double tali;
    public double volumeSegmen;

    public Tembereng(double jariJariLingkaran, double tali, double tinggiTembereng){
        super(jariJariLingkaran);
        super.hitungLuasPermukaanBola();
        super.hitungVolumeBola();
        this.tali = tali;
        this.tinggiTembereng = tinggiTembereng;
    }

    public double hitungTinggiTembereng(){
        tinggiTembereng = super.jariJariLingkaran - Math.sqrt(Math.pow (super.jariJariLingkaran, 2)-Math.pow(tali, 2));
        return tinggiTembereng;
    }

    public double hitungLuasPermukaanTembereng(){
        luasPermukaanTembereng = super.luasPermukaanBola-super.kelilingLingkaran;
        return luasPermukaanTembereng;
    }
    
    public double hitungvolumeSegmen(){
        volumeSegmen = (1/3)* Math.PI * Math.pow(this.tinggiTembereng, 2) * (3 * super.jariJariLingkaran - this.tinggiTembereng);
        return volumeSegmen;
    }

    public double hitungVolumeTembereng(){
        volumeTembereng = super.volumeBola - this.volumeSegmen;
        return volumeTembereng;
    }
    
    public void tampilkanInfo(){
        System.out.println("Tinggi Tembereng : " + this.tinggiTembereng);
        System.out.println("Tali Busur : " + this.tali);
        System.out.println("Jari - jari : " + super.jariJariLingkaran);
        System.out.println("Luas Tembereng : " + this.luasPermukaanTembereng);
        System.out.println("Keliling Tembereng : " + this.volumeTembereng);
    }
}
