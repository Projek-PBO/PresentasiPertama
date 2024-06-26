/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

import projectgeometri.Geometri2D.Persegi;

/**
 *
 * @author ASUS
 */
public class LimasPersegi extends Persegi{
    public double tinggiLimas;
    public double luasSisiTegakLimas;
    public double luasPermukaanLimas;
    public double volumeLimas;
    
    public LimasPersegi(double tinggiLimas, double sisiPersegi) {
        super(sisiPersegi);
        this.tinggiLimas = tinggiLimas;
        super.hitungLuas();
        this.hitungLuasSisiTegakLimas();
    }

    public double hitungLuasSisiTegakLimas(){
        luasSisiTegakLimas = super.sisiPersegi * tinggiLimas /2;
        return luasSisiTegakLimas;
    }
    public double hitungLuasPermukaan(){
        luasPermukaanLimas = 4 * this.luasSisiTegakLimas + super.luasPersegi;
        return luasPermukaanLimas;
    }
    public double hitungVolumeLimas(){
        volumeLimas = (super.luasPersegi * tinggiLimas)/3;
        return volumeLimas;
    }
    
    public void tampilkanInfo(){
        System.out.println("Tinggi Limas : " + this.tinggiLimas);
        System.out.println("Sisi Persegi : " + super.sisiPersegi);
        System.out.println("Volume Limas Persegi : " + this.volumeLimas);
        System.out.println("Luas Permukaan Limas Persegi : " + this.luasPermukaanLimas);
    }
}
