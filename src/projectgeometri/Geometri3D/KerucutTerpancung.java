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

    public KerucutTerpancung() {
        this.tinggiPancung = 3.0;
    }

    public KerucutTerpancung(double tinggiPancung) {
        this.tinggiPancung = tinggiPancung;
    }

    public KerucutTerpancung(double tinggiPancung, double tinggiKerucut) {
        super(tinggiKerucut);
        this.tinggiPancung = tinggiPancung;
    }

    public KerucutTerpancung(double tinggiPancung, double tinggiKerucut, double jariJariLingkaran) {
        super(jariJariLingkaran, tinggiKerucut);
        this.tinggiPancung = tinggiPancung;
    }

    public double hitungJariJariPancung(){
        jariJariPancung = super.jariJariLingkaran / super.tinggiKerucut * tinggiPancung;
        return jariJariPancung; 
    }

    public double hitungVolumeKerucutTerpancung(){
        volumeKerucutTerpancung = super.volumeKerucut - (jariJariPancung * tinggiPancung / 3);
        return volumeKerucutTerpancung;
    }

    public double hitungPermukaanKerucutTerpancung(){
        luasPermukaanKerucutTerpancung = super.luasPermukaanKerucut - (Math.PI * jariJariPancung * (garisPelukisKerucutTerpancung + jariJariPancung));
        return luasPermukaanKerucutTerpancung;
    }

    public double hitungGarisPelukisKerucutTerpancung(){
        garisPelukisKerucutTerpancung = Math.sqrt(Math.pow(jariJariPancung,2) + Math.pow(tinggiPancung,2));
        return garisPelukisKerucutTerpancung;
    }
}
