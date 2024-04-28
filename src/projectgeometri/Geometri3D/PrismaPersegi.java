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
public class PrismaPersegi extends Persegi{
    double panjangPrismaPersegi;
    double lebarPrismaPersegi;
    double tinggiPrismaPersegi;
    double luasPermukaanPrismaPersegi;
    double volumePrismaPersegi;

    public PrismaPersegi(double panjangPrismaPersegi, double lebarPrismaPersegi, double tinggiPrismaPersegi) {
        this.panjangPrismaPersegi = panjangPrismaPersegi;
        this.lebarPrismaPersegi = lebarPrismaPersegi;
        this.tinggiPrismaPersegi = tinggiPrismaPersegi;
    }

    public PrismaPersegi(double panjangPrismaPersegi, double lebarPrismaPersegi, double tinggiPrismaPersegi, double luasPermukaanPrismaPersegi, double volumePrismaPersegi) {
        this.panjangPrismaPersegi = panjangPrismaPersegi;
        this.lebarPrismaPersegi = lebarPrismaPersegi;
        this.tinggiPrismaPersegi = tinggiPrismaPersegi;
        this.luasPermukaanPrismaPersegi = luasPermukaanPrismaPersegi;
        this.volumePrismaPersegi = volumePrismaPersegi;
    }

    public double getPanjangPrismaPersegi() {
        return panjangPrismaPersegi;
    }

    public void setPanjangPrismaPersegi(double panjangPrismaPersegi) {
        this.panjangPrismaPersegi = panjangPrismaPersegi;
    }

    public double getLebarPrismaPersegi() {
        return lebarPrismaPersegi;
    }

    public void setLebarPrismaPersegi(double lebarPrismaPersegi) {
        this.lebarPrismaPersegi = lebarPrismaPersegi;
    }

    public double getTinggiPrismaPersegi() {
        return tinggiPrismaPersegi;
    }

    public void setTinggiPrismaPersegi(double tinggiPrismaPersegi) {
        this.tinggiPrismaPersegi = tinggiPrismaPersegi;
    }

    public double getLuasPermukaanPrismaPersegi() {
        return luasPermukaanPrismaPersegi;
    }

    public void setLuasPermukaanPrismaPersegi(double luasPermukaanPrismaPersegi) {
        this.luasPermukaanPrismaPersegi = luasPermukaanPrismaPersegi;
    }

    public double getVolumePrismaPersegi() {
        return volumePrismaPersegi;
    }

    public void setVolumePrismaPersegi(double volumePrismaPersegi) {
        this.volumePrismaPersegi = volumePrismaPersegi;
    }
    
    public double hitungVolumePrismaPersegi(){
        volumePrismaPersegi = super.luasPersegi * tinggiPrismaPersegi;
        return volumePrismaPersegi;
    }
    
    public double hitungVolumePrismaPersegi(double sisi){
        volumePrismaPersegi = sisi * sisi * tinggiPrismaPersegi;
        return volumePrismaPersegi;
    }
    
    public double hitungLuasPermukaanPrismaPersegi(){
        luasPermukaanPrismaPersegi = 2 * (super.luasPersegi + super.sisiPersegi*tinggiPrismaPersegi + super.sisiPersegi*tinggiPrismaPersegi);
        return luasPermukaanPrismaPersegi;
    }
    
    public double hitungLuasPermukaanBalok(double sisi){
        luasPermukaanPrismaPersegi = 2 * (2 * (sisi * sisi) + sisi * tinggiPrismaPersegi);
        return luasPermukaanPrismaPersegi;
    }  
}
