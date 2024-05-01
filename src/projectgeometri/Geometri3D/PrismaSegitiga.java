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
    double tinggiPrisma;
    double volumePrisma;
    double luasPermukaanPrisma;
    
    public PrismaSegitiga() {
        this.tinggiPrisma = 20.0;
    }
    
    public PrismaSegitiga(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma) {
        super(alasSegitiga, tinggiSegitiga);
        this.tinggiPrisma = tinggiPrisma;
    }
     
    public double hitungVolumePrisma(){
        volumePrisma = super.luasSegitiga * tinggiPrisma;
        return volumePrisma;
    }
    public double hitungLuasPermukaanPrisma(){
        luasPermukaanPrisma = 2 * super.luasSegitiga + super.kelilingSegitiga * tinggiPrisma;
        return luasPermukaanPrisma;
    }
}
