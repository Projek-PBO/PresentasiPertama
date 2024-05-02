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
public class PrismaPersegiPanjang extends PersegiPanjang {
    double tinggiPrisma;
    double volumePrisma;
    double luasPermukaanPrisma;

    public PrismaPersegiPanjang() {
        this.tinggiPrisma = 20.0;
    }
    
    public PrismaPersegiPanjang(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public PrismaPersegiPanjang(double lebarPersegiPanjang, double panjangPersegiPanjang, double tinggiPrisma) {
        super(lebarPersegiPanjang, panjangPersegiPanjang);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume(){
        volumePrisma = super.luasPersegiPanjang * tinggiPrisma;
        return volumePrisma;
    }
    public double hitungLuasPermukaanPrisma(){
        luasPermukaanPrisma = 2 * super.luasPersegiPanjang + super.kelilingPersegiPanjang * tinggiPrisma;
        return luasPermukaanPrisma;
    }
    
}
