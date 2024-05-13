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
public class PrismaSegitiga extends Segitiga{
    public double tinggiPrisma;
    public double volumePrisma;
    public double luasPermukaanPrisma;

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma) {
        super(alasSegitiga, tinggiSegitiga);
        this.tinggiPrisma = tinggiPrisma;
        super.hitungLuas();
        super.hitungKeliling();
    }
     
    public double hitungVolumePrisma(){
        volumePrisma = super.luasSegitiga * tinggiPrisma;
        return volumePrisma;
    }
    public double hitungLuasPermukaanPrisma(){
        luasPermukaanPrisma = 2 * super.luasSegitiga + super.kelilingSegitiga * tinggiPrisma;
        return luasPermukaanPrisma;
    }
    
    public void tampilkanInfo(){
        System.out.println("Alas Prisma Segitiga : " + super.alasSegitiga);
        System.out.println("Tinggi Alas Prisma Segitga : " + super.tinggiSegitiga);
        System.out.println("Tinggi Prisma Segitiga : " + this.tinggiPrisma);
        System.out.println("Volume Prisma Segitiga : " + this.volumePrisma);
        System.out.println("Luas Permukaan Prisma Segitiga : " + this.luasPermukaanPrisma);
    }
}
