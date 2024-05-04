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

    public PrismaPersegi(double sisiPersegi, double tinggiPrismaPersegi) {
        super(sisiPersegi);
        this.tinggiPrismaPersegi = tinggiPrismaPersegi;
        super.hitungLuas();
        super.hitungKeliling();
    }
    
    public double hitungVolumePrismaPersegi(){
        volumePrismaPersegi = super.luasPersegi * tinggiPrismaPersegi;
        return volumePrismaPersegi;
    }
    
    public double hitungLuasPermukaanPrismaPersegi(){
        luasPermukaanPrismaPersegi = 2 * super.luasPersegi + super.kelilingPersegi * tinggiPrismaPersegi;
        return luasPermukaanPrismaPersegi;
    }
    
    public void tampilkanInfo(){
        System.out.println("Alas Sisi Persegi : " + super.sisiPersegi);
        System.out.println("Tinggi Prisma Persegi : " + this.tinggiPrismaPersegi);
        System.out.println("Volume Prisma Persegi : " + this.volumePrismaPersegi);
        System.out.println("Luas Permukaan Prisma Persegi : " + this.luasPermukaanPrismaPersegi);
    }
}
