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
public class KerucutTerpancung extends Kerucut{
    double tinggiPancung;
    double volumeKerucutTerpancung;
    double luasPermukaanKerucutTerpancung;
    double garisPelukisKerucutTerpancung;
    double jariJariPancung;

    public KerucutTerpancung(double tinggiPancung, double tinggiKerucut, double jariJariLingkaran) {
        super(tinggiKerucut, jariJariLingkaran);
        this.tinggiPancung = tinggiPancung;
        this.hitungJariJariPancung();
        this.hitungGarisPelukisKerucutTerpancung();
        super.hitungVolumeKerucut();
        super.hitungLuasPermukaanKerucut();
        
    }

    public double hitungJariJariPancung(){
        jariJariPancung = super.jariJariLingkaran * tinggiPancung / super.tinggiKerucut;
        return jariJariPancung; 
    }

    public double hitungVolumeKerucutTerpancung(){
        volumeKerucutTerpancung = super.volumeKerucut - (Math.PI*Math.pow(jariJariPancung,2) * tinggiPancung / 3);
        return volumeKerucutTerpancung;
    }

    public double hitungLuasPermukaanKerucutTerpancung(){
        luasPermukaanKerucutTerpancung = super.luasPermukaanKerucut - (Math.PI * jariJariPancung * (garisPelukisKerucutTerpancung + jariJariPancung) - (Math.PI*Math.pow(jariJariPancung, 2)));
        return luasPermukaanKerucutTerpancung;
    }

    public double hitungGarisPelukisKerucutTerpancung(){
        garisPelukisKerucutTerpancung = Math.sqrt(Math.pow(jariJariPancung,2) + Math.pow(tinggiPancung,2));
        return garisPelukisKerucutTerpancung;
    }
    
    public void tampilkanInfo(){
        System.out.println("Jari-Jari Pancung : " + this.jariJariPancung);
        System.out.println("Volume Kerucut Terpancung : " + this.volumeKerucutTerpancung);
        System.out.println("Luas Permukaan Kerucut Terpancung : " + this.luasPermukaanKerucutTerpancung);
    }
}
