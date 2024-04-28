/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

import projectgeometri.Geometri2D.PersegiPanjang;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang{
    double panjangBalok;
    double lebarBalok;
    double tinggiBalok;
    double luasPermukaanBalok;
    double volumeBalok;

    public Balok(double panjangBalok, double lebarBalok, double tinggiBalok) {
        this.panjangBalok = panjangBalok;
        this.lebarBalok = lebarBalok;
        this.tinggiBalok = tinggiBalok;
    }

    public Balok(double panjangBalok, double lebarBalok, double tinggiBalok, double luasPermukaanBalok, double volumeBalok) {
        this.panjangBalok = panjangBalok;
        this.lebarBalok = lebarBalok;
        this.tinggiBalok = tinggiBalok;
        this.luasPermukaanBalok = luasPermukaanBalok;
        this.volumeBalok = volumeBalok;
    }

    public double getPanjangBalok() {
        return panjangBalok;
    }

    public void setPanjangBalok(double panjangBalok) {
        this.panjangBalok = panjangBalok;
    }

    public double getLebarBalok() {
        return lebarBalok;
    }

    public void setLebarBalok(double lebarBalok) {
        this.lebarBalok = lebarBalok;
    }

    public double getTinggiBalok() {
        return tinggiBalok;
    }

    public void setTinggiBalok(double tinggiBalok) {
        this.tinggiBalok = tinggiBalok;
    }

    public double getLuasPermukaanBalok() {
        return luasPermukaanBalok;
    }

    public void setLuasPermukaanBalok(double luasPermukaanBalok) {
        this.luasPermukaanBalok = luasPermukaanBalok;
    }

    public double getVolumeBalok() {
        return volumeBalok;
    }

    public void setVolumeBalok(double volumeBalok) {
        this.volumeBalok = volumeBalok;
    }
    
    public double hitungVolumeBalok(){
        volumeBalok = super.luasPersegiPanjang * tinggiBalok;
        return volumeBalok;
    }
    
    public double hitungVolumeBalok(double panjang, double lebar){
        volumeBalok = panjang * lebar * tinggiBalok;
        return volumeBalok;
    }
    
    public double hitungLuasPermukaanBalok(){
        luasPermukaanBalok = 2 * (super.luasPersegiPanjang + super.lebarPersegiPanjang*tinggiBalok + super.panjangPersegiPanjang*tinggiBalok);
        return luasPermukaanBalok;
    }
    
    public double hitungLuasPermukaanBalok(double lebar, double panjang){
        luasPermukaanBalok = 2 * (panjang * lebar + panjang * tinggiBalok + lebar * tinggiBalok);
        return luasPermukaanBalok;
    }  
}
