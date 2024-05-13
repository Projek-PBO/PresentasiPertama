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
public class Juring extends Bola{
    public double derajatJuring;
    public double luasPermukaanJuring;
    public double volumeJuring;
    public double panjangTali;
    public double tinggiJuring;
    public double volumeJuringKerucut;

    public Juring(double panjangTali, double jariJariLingkaran){
        super(jariJariLingkaran);
        super.volumeBola();
        super.luasPermukaanBola();
        this.derajatJuring = derajatJuring;
        this.panjangTali = panjangTali;
    }
    
    //public double hitungDerajatJuring(){
    //    derajatJuring = 2 * Math.asin(this.panjangTali/(2 * super.jariJariLingkaran));
    //   return derajatJuring;
    //}
    
    public double hitungTinggiJuring(){
        tinggiJuring = super.jariJariLingkaran * Math.cos(this.derajatJuring/2);
        return tinggiJuring;
    }
    
    public volumeJuringKerucut(){
        volumeJuringKerucut = (1/3)*super.luasLingkaran*this.tinggiJuring;
        return volumeJuringKerucut;
    }
    

    public double hitungVolumeJuring(){
        volumeJuring = super.volumeBola - this.volumeJuringKerucut;
        return volumeJuring;
    }
    
    public double hitungLuasPermukaanJuring(){
        derajatJuring = 2 * Math.asin(this.panjangTali/(2 * super.jariJariLingkaran));
        luasPermukaanJuring = super.luasPermukaanBola * (derajatJuring/(2*Math.PI));
        return luasPermukaanJuring;
    }
    
    public void tampilkanInfo(){
        System.out.println("Panjang Tali : " + this.panjangTali);
        System.out.println("Jari-jari : " + super.jariJariLingkaran);
        System.out.println("Luas Permukaan Juring : " + this.luasPermukaanJuring) ;
        System.out.println("Volume Juring : " + this.volumeJuring);
    }
}
