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
    double tinggiKerucut;
    double volumeKerucut;
    double luasPermukaanKerucut;
    double garisPelukisKerucut;    

    public Kerucut() {
        this.tinggiKerucut = 10.0;
        this.volumeKerucut = this.hitungVolumeKerucut();
        this.garisPelukisKerucut = this.hitungGarisPelukis();
        this.luasPermukaanKerucut = this.hitungLuasPermukaanKerucut();
    }
    
    public double hitungVolumeKerucut(){
        volumeKerucut = 1/3 * super.luasLingkaran * tinggiKerucut;
        return volumeKerucut;
    }
    public double hitungLuasPermukaanKerucut(){
        luasPermukaanKerucut = Math.PI * super.jariJariLingkaran * (garisPelukisKerucut + super.jariJariLingkaran);
        return luasPermukaanKerucut;
    }
    public double hitungGarisPelukis(){
        garisPelukisKerucut = Math.sqrt(Math.pow(super.jariJariLingkaran,2) + Math.pow(tinggiKerucut,2));
        return garisPelukisKerucut;
    }
    
}
