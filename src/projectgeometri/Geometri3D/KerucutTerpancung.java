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
    public double tinggiPancung;
    public double volumeKerucutTerpancung;
    public double luasPermukaanKerucutTerpancung;
    public double garisPelukisKerucutTerpancung;
    public double jariJariPancung;

    public KerucutTerpancung(double tinggiPancung, double tinggiKerucut, double jariJariLingkaran) {
        super(tinggiKerucut, jariJariLingkaran);
        this.tinggiPancung = tinggiPancung;
        super.hitungVolumeKerucut();
        super.hitungLuasPermukaanKerucut();
    }

    public double hitungJariJariPancung(){
        jariJariPancung = super.jariJariLingkaran * tinggiPancung / super.tinggiKerucut;
        return jariJariPancung; 
    }

    public double hitungVolumeKerucutTerpancung(){
        Kerucut pancung = new Kerucut(tinggiPancung, hitungJariJariPancung());
        pancung.hitungVolumeKerucut();
        volumeKerucutTerpancung = super.volumeKerucut - pancung.volumeKerucut;
        return volumeKerucutTerpancung;
    }

    public double hitungLuasPermukaanKerucutTerpancung(){
        Kerucut pancung = new Kerucut(tinggiPancung, hitungJariJariPancung());
        pancung.hitungGarisPelukis();
        luasPermukaanKerucutTerpancung = super.luasPermukaanKerucut - (Math.PI * pancung.jariJariLingkaran * pancung.garisPelukisKerucut) + pancung.luasLingkaran;
        return luasPermukaanKerucutTerpancung;
    }
    
    public void tampilkanInfo(){
        System.out.println("Jari-Jari Pancung : " + this.jariJariPancung);
        System.out.println("Volume Kerucut Terpancung : " + this.volumeKerucutTerpancung);
        System.out.println("Luas Permukaan Kerucut Terpancung : " + this.luasPermukaanKerucutTerpancung);
    }
}
