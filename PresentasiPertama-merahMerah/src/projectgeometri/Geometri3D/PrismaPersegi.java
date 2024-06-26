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
    double tinggiPrismaPersegi;
    double luasPermukaanPrismaPersegi;
    double volumePrismaPersegi;
    
    public PrismaPersegi() {
        this.tinggiPrismaPersegi = 20.0;
    }
    
    public PrismaPersegi(double tinggiPrismaPersegi) {
        this.tinggiPrismaPersegi = tinggiPrismaPersegi;
    }

    public PrismaPersegi(double sisiPersegi, double tinggiPrismaPersegi) {
        super(sisiPersegi);
        this.tinggiPrismaPersegi = tinggiPrismaPersegi;
    }
    
    public double hitungVolumePrismaPersegi(){
        volumePrismaPersegi = super.luasPersegi * tinggiPrismaPersegi;
        return volumePrismaPersegi;
    }
    
    public double hitungLuasPermukaanPrismaPersegi(){
        luasPermukaanPrismaPersegi = 2 * super.luasPersegi + super.kelilingPersegi * tinggiPrismaPersegi;
        return luasPermukaanPrismaPersegi;
    } 
}
