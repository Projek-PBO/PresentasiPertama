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
    double tinggiLimas;
    double luasSisiTegakLimas;
    double luasPermukaanLimas;
    double volumeLimas;

    public LimasPersegi() {
        this.tinggiLimas = 20.0;
    }
    
    public LimasPersegi(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
    
    public LimasPersegi(double tinggiLimas, double sisiPersegi) {
        super(sisiPersegi);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasSisiTegakLimas(){
        luasSisiTegakLimas = super.sisiPersegi * tinggiLimas /2;
        return luasSisiTegakLimas;
    }
    public double hitungLuasPermukaan(){
        luasPermukaanLimas = super.luasPersegi + 4 * luasSisiTegakLimas;
        return luasPermukaanLimas;
    }
    public double hitungVolumeLimas(){
        volumeLimas = 1/3 * super.luasPersegi * tinggiLimas;
        return volumeLimas;
    }
    
    public void tampilkanInfo(){
        System.out.println("Tinggi Limas : " + this.tinggiLimas);
        System.out.println("Sisi Persegi : " + super.sisiPersegi);
        System.out.println("Volume Limas Persegi : " + this.volumeLimas);
        System.out.println("Luas Permukaan Limas Persegi : " + this.luasSisiTegakLimas);
    }
}
