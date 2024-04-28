/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri2D;
import projectgeometri.Benda2D;


/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements Benda2D{
    public double lebarPersegiPanjang;
    public double panjangPersegiPanjang;
    public double luasPersegiPanjang;
    public double kelilingPersegiPanjang;
    
    public PersegiPanjang() {
        this.lebarPersegiPanjang = 5.0;
        this.panjangPersegiPanjang = 10.0;
        this.luasPersegiPanjang = this.hitungLuas();
        this.kelilingPersegiPanjang = this.hitungKeliling();
    }
    
    public PersegiPanjang(double lebarPersegiPanjang, double panjangPersegiPanjang) {
        this.lebarPersegiPanjang = lebarPersegiPanjang;
        this.panjangPersegiPanjang = panjangPersegiPanjang;
        this.luasPersegiPanjang = this.hitungLuas();
        this.kelilingPersegiPanjang = this.hitungKeliling();
    }
    
    public double getLebarPersegiPanjang() {
        return lebarPersegiPanjang;
    }

    public void setLebarPersegiPanjang(double lebarPersegiPanjang) {
        this.lebarPersegiPanjang = lebarPersegiPanjang;
    }

    public double getPanjangPersegiPanjang() {
        return panjangPersegiPanjang;
    }

    public void setPanjangPersegiPanjang(double panjangPersegiPanjang) {
        this.panjangPersegiPanjang = panjangPersegiPanjang;
    }

    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    public void setLuasPersegiPanjang(double luasPersegiPanjang) {
        this.luasPersegiPanjang = luasPersegiPanjang;
    }

    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

    public void setKelilingPersegiPanjang(double kelilingPersegiPanjang) {
        this.kelilingPersegiPanjang = kelilingPersegiPanjang;
    }

    @Override
    public double hitungLuas() {
        luasPersegiPanjang = lebarPersegiPanjang*panjangPersegiPanjang;
        return luasPersegiPanjang;
    }

    @Override
    public double hitungKeliling() {
        kelilingPersegiPanjang = 2*(lebarPersegiPanjang + panjangPersegiPanjang);
        return kelilingPersegiPanjang;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Lebar persegi panjang : " + lebarPersegiPanjang);
        System.out.println("Panjang persegi panjang : " + panjangPersegiPanjang);
        System.out.println("Keliling persegi panjang : " + kelilingPersegiPanjang);
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang);
    }
    
//    double hitungLebarDariLuas(){
//        lebarPersegiPanjang = luasPersegiPanjang/panjangPersegiPanjang;
//        return lebarPersegiPanjang;
//    }
//    double hitungLebarDariKeliling(){
//        lebarPersegiPanjang = (kelilingPersegiPanjang/2)-panjangPersegiPanjang;
//        return lebarPersegiPanjang;
//    }
//    double hitungPanjangDariLuas(){
//        panjangPersegiPanjang = luasPersegiPanjang/lebarPersegiPanjang;
//        return panjangPersegiPanjang;
//    }
//    double hitungPanjangDariKeliling(){
//        panjangPersegiPanjang = (kelilingPersegiPanjang/2)-lebarPersegiPanjang;
//        return panjangPersegiPanjang;
//    }
}
