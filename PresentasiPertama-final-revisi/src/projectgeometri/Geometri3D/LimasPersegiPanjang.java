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
    public double tinggiLimas;
    public double luasSisiMiring1;
    public double luasSisiMiring2;
    public double volumeLimas;
    public double luasPermukaanLimas;
    
    public LimasPersegiPanjang(double lebarPersegiPanjang, double panjangPersegiPanjang, double tinggiLimas) {
        super(lebarPersegiPanjang, panjangPersegiPanjang);
        this.tinggiLimas = tinggiLimas;
        super.hitungLuas();
        this.hitungLuasSisiMiring1();
        this.hitungLuasSisiMiring2();
    }
    
    public double hitungVolumeLimas(){
        volumeLimas = super.luasPersegiPanjang * tinggiLimas / 3;
        return volumeLimas;
    }
    public double hitungLuasPermukaanLimas(){
        luasPermukaanLimas = super.luasPersegiPanjang + 2 * luasSisiMiring1 + 2 * luasSisiMiring2;
        return luasPermukaanLimas;
    }
    public double hitungLuasSisiMiring1(){
        luasSisiMiring1 = super.panjangPersegiPanjang * tinggiLimas / 2;
        return luasSisiMiring1;
    }
    public double hitungLuasSisiMiring2(){
        luasSisiMiring2 = super.lebarPersegiPanjang * tinggiLimas / 2;
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
