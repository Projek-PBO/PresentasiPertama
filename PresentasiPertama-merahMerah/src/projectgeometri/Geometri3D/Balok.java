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
    double tinggiBalok;
    double luasPermukaanBalok;
    double volumeBalok;
    
    public Balok(){
        this.tinggiBalok = 12.0;
        this.volumeBalok = this.hitungVolumeBalok();
        this.luasPermukaanBalok = this.hitungLuasPermukaanBalok();
    }
    
    public Balok(double tinggiBalok){
        this.tinggiBalok = tinggiBalok;
        this.volumeBalok = this.hitungVolumeBalok();
        this.luasPermukaanBalok = this.hitungLuasPermukaanBalok();
    }

    public Balok(double lebarPersegiPanjang, double panjangPersegiPanjang, double tinggiBalok) {
        super(lebarPersegiPanjang, panjangPersegiPanjang);
        this.tinggiBalok = tinggiBalok;
        super.luasPersegiPanjang = super.hitungLuas();
        super.kelilingPersegiPanjang = super.hitungKeliling();
        this.volumeBalok = this.hitungVolumeBalok();
        this.luasPermukaanBalok = this.hitungLuasPermukaanBalok();
    } 
    public double hitungVolumeBalok(){
        volumeBalok = super.luasPersegiPanjang * tinggiBalok;
        return volumeBalok;
    }
    
    public double hitungLuasPermukaanBalok(){
        luasPermukaanBalok = 2 * (super.luasPersegiPanjang + super.lebarPersegiPanjang*tinggiBalok + super.panjangPersegiPanjang*tinggiBalok);
        return luasPermukaanBalok;
    } 
    public void tampilkanInfo(){
        System.out.println("Panjang balok : " + super.panjangPersegiPanjang);
        System.out.println("Lebar balok : " + super.lebarPersegiPanjang);
        System.out.println("Tinggi balok : " + this.tinggiBalok);
        System.out.println("Volume kubus : " + this.volumeBalok);
        System.out.println("Luas permukaan kubus : " + this.luasPermukaanBalok);
    }
}
