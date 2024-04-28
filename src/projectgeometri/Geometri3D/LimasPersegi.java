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
    double sisiAlasLimas;
    double tinggiLimas;
    double luasAlasLimas;
    double luasSisiTegakLimas;
    double luasPermukaanLimas;
    double volumeLimas;

    public LimasPersegi(double sisiAlasLimas, double tinggiLimas) {
        this.sisiAlasLimas = sisiAlasLimas;
        this.tinggiLimas = tinggiLimas;
    }

    public LimasPersegi(double sisiAlasLimas, double tinggiLimas, double luasAlasLimas, double luasSisiMiringLimas) {
        this.sisiAlasLimas = sisiAlasLimas;
        this.tinggiLimas = tinggiLimas;
        this.luasAlasLimas = luasAlasLimas;
        this.luasSisiTegakLimas = luasSisiMiringLimas;
    }
    
    public LimasPersegi(double sisiAlasLimas, double tinggiLimas, double luasAlasLimas, double luasSisiMiringLimas, double luasPermukaanLimas, double volumeLimas) {
        this.sisiAlasLimas = sisiAlasLimas;
        this.tinggiLimas = tinggiLimas;
        this.luasAlasLimas = luasAlasLimas;
        this.luasSisiTegakLimas = luasSisiMiringLimas;
        this.luasPermukaanLimas = luasPermukaanLimas;
        this.volumeLimas = volumeLimas;
    }

    public double getSisiAlasLimas() {
        return sisiAlasLimas;
    }

    public void setSisiAlasLimas(double sisiAlasLimas) {
        this.sisiAlasLimas = sisiAlasLimas;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }

    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }

    public double getLuasAlasLimas() {
        return luasAlasLimas;
    }

    public void setLuasAlasLimas(double luasAlasLimas) {
        this.luasAlasLimas = luasAlasLimas;
    }

    public double getLuasSisiMiringLimas() {
        return luasSisiTegakLimas;
    }

    public void setLuasSisiMiringLimas(double luasSisiMiringLimas) {
        this.luasSisiTegakLimas = luasSisiMiringLimas;
    }

    public double getLuasPermukaanLimas() {
        return luasPermukaanLimas;
    }

    public void setLuasPermukaanLimas(double luasPermukaanLimas) {
        this.luasPermukaanLimas = luasPermukaanLimas;
    }

    public double getVolumeLimas() {
        return volumeLimas;
    }

    public void setVolumeLimas(double volumeLimas) {
        this.volumeLimas = volumeLimas;
    }
    public double hitungLuasPermukaan(){
        luasPermukaanLimas = super.luasPersegi + 4 * luasSisiTegakLimas;
        return luasPermukaanLimas;
    }
    public double hitungLuasPermukaan(double sisiAlas){
        luasPermukaanLimas = sisiAlas*sisiAlas + 4 * luasSisiTegakLimas;
        return luasPermukaanLimas;
    }
    public double hitungVolumeLimas(){
        volumeLimas = 1/3 * super.luasPersegi * tinggiLimas;
        return volumeLimas;
    }
    public double hitungVolumeLimas(double sisiAlas){
        volumeLimas = 1/3 * super.hitungLuas() * tinggiLimas;
        return volumeLimas;
    }
    public double hitungLuasAlasLimas(){
        luasAlasLimas = Math.pow(sisiAlasLimas,2);
        return luasAlasLimas;
    }
}
