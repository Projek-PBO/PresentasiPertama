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
public class LimasPersegiPanjang extends PersegiPanjang{
    double tinggiLimas;
    double luasSisiMiring1;
    double luasSisiMiring2;
    double volumeLimas;
    double luasPermukaanLimas;

    public LimasPersegiPanjang() {
        this.tinggiLimas = 20.0;
    }
    
    public LimasPersegiPanjang(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
    
    public LimasPersegiPanjang(double lebarPersegiPanjang, double panjangPersegiPanjang, double tinggiLimas) {
        super(lebarPersegiPanjang, panjangPersegiPanjang);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolumeLimas(){
        volumeLimas = 1/3 * super.luasPersegiPanjang * tinggiLimas;
        return volumeLimas;
    }
    public double hitungLuasPermukaanLimas(){
        luasPermukaanLimas = super.luasPersegiPanjang + 2 * luasSisiMiring1 + luasSisiMiring2;
        return luasPermukaanLimas;
    }
    public double hitungLuasSisiMiring1(){
        luasSisiMiring1 = 1/2 * super.panjangPersegiPanjang * tinggiLimas;
        return luasSisiMiring1;
    }
    public double hitungLuasSisiMiring2(){
        luasSisiMiring2 = 1/2 * super.lebarPersegiPanjang * tinggiLimas;
        return luasSisiMiring2;
    }
    
    public void tampilkanInfo(){
        System.out.println("Lebar Persegi Panjang : " + super.lebarPersegiPanjang);
        System.out.println("Panjang Persegi Panjang : " + super.panjangPersegiPanjang);
        System.out.println("Tinggi Limas : " + this.tinggiLimas);
        System.out.println("Volume Limas Persegi Panjang : " + this.volumeLimas);
        System.out.println("Luas Permukaan Limas Persegi Panjang : " + this.luasPermukaanLimas);
    }
    
}
