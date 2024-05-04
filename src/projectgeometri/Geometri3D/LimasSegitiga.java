/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

import projectgeometri.Geometri2D.Segitiga;

/**
 *
 * @author ASUS
 */
public class LimasSegitiga extends Segitiga{
    double tinggiLimas;
    double luasSisiMiring;
    double volumeLimas;
    double luasPermukaanLimas;
    
    public LimasSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiLimas) {
        super(alasSegitiga, tinggiSegitiga);
        this.tinggiLimas = tinggiLimas;
        super.hitungLuas();
        this.hitungLuasSisiMiring();
    }
    
    public double hitungVolumeLimas(){
        volumeLimas = (super.luasSegitiga * tinggiLimas)/3;
        return volumeLimas;
    }
    public double hitungLuasPermukaanLimas(){
        luasPermukaanLimas = super.luasSegitiga + 3 * luasSisiMiring;
        return luasPermukaanLimas;
    }
    public double hitungLuasSisiMiring(){
        luasSisiMiring = (super.alasSegitiga * tinggiLimas / 2) + (super.tinggiSegitiga * tinggiLimas / 2) + (super.sisiSampingSegitiga * tinggiLimas / 2);
        return luasSisiMiring;
    }
    
    public void tampilkanInfo(){
        System.out.println("Alas Segitiga : " + super.alasSegitiga );
        System.out.println("Tinggi Alas Segitiga : " + super.tinggiSegitiga);
        System.out.println("Tinggi Limas Segitiga :  " + this.tinggiLimas);
        System.out.println("Volume Limas Segitiga : " + this.volumeLimas);
        System.out.println("Luas Permukaan Limas Segitga : " + this.luasPermukaanLimas);
    }
}
