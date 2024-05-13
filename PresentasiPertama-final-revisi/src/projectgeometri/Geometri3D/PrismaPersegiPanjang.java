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
    public double tinggiPrisma;
    public double volumePrisma;
    public double luasPermukaanPrisma;
    
    public PrismaPersegiPanjang(double lebarPersegiPanjang, double panjangPersegiPanjang, double tinggiPrisma) {
        super(lebarPersegiPanjang, panjangPersegiPanjang);
        this.tinggiPrisma = tinggiPrisma;
        super.hitungLuas();
        super.hitungKeliling();
    }
    
    public double hitungVolume(){
        volumePrisma = super.luasPersegiPanjang * tinggiPrisma;
        return volumePrisma;
    }
    public double hitungLuasPermukaanPrisma(){
        luasPermukaanPrisma = 2 * super.luasPersegiPanjang + super.kelilingPersegiPanjang * tinggiPrisma;
        return luasPermukaanPrisma;
    }
    
    public void tampilkanInfo(){
        System.out.println("Panjang Alas Prisma Persegi Panjang : " + super.panjangPersegiPanjang);
        System.out.println("Lebar Alas Prisma Persegi Panjang : " + super.lebarPersegiPanjang);
        System.out.println("Tinggi Primsa Persegi Panjang : " + this.tinggiPrisma);
        System.out.println("Volume Prisma Persegi Panjang : " + this.volumePrisma);
        System.out.println("Luas Permukaan Prisma Persegi Panjang : " + this.luasPermukaanPrisma);
    }
    
}
