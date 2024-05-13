/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

import projectgeometri.Geometri2D.Lingkaran;

/**
 *
 * @author ASUS
 */
public class Kerucut extends Lingkaran {
    public double tinggiKerucut;
    public double volumeKerucut;
    public double luasPermukaanKerucut;
    public double garisPelukisKerucut;    

    public Kerucut(double tinggiKerucut, double jariJariLingkaran) {
        super(jariJariLingkaran);
        super.hitungLuas();
        this.tinggiKerucut = tinggiKerucut;
    }
    
    public double hitungVolumeKerucut(){
        volumeKerucut = (super.luasLingkaran * tinggiKerucut) / 3;
        return volumeKerucut;
    }
    public double hitungLuasPermukaanKerucut(){
        luasPermukaanKerucut = Math.PI * super.jariJariLingkaran * (this.hitungGarisPelukis() + super.jariJariLingkaran);
        return luasPermukaanKerucut;
    }
    public double hitungGarisPelukis(){
        garisPelukisKerucut = Math.sqrt(Math.pow(super.jariJariLingkaran,2) + Math.pow(tinggiKerucut,2));
        return garisPelukisKerucut;
    }
    
    public void tampilkanInfo(){
        System.out.println("Tinggi Kerucut : " + this.tinggiKerucut);
        System.out.println("Jari-jari Lingkaran : " + super.jariJariLingkaran);
        System.out.println("Volume Kerucut : " + this.volumeKerucut);
        System.out.println("Luas Permukaan Kerucut : " + this.luasPermukaanKerucut);
    }
    
}
