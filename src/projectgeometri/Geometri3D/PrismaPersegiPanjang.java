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
    double luasSisiSamping1;
    double luasSisiSamping2;
    
    public double hitungVolume(){
        volumePrisma = super.luasPersegiPanjang * tinggiPrisma;
        return volumePrisma;
    }
    public double hitungLuasPermukaanPrisma(){
        luasPermukaanPrisma = 2 * (super.luasPersegiPanjang + luasSisiSamping1 + luasSisiSamping2);
        return luasPermukaanPrisma;
    }
    public double hitungLuasSisiSamping1(){
        luasSisiSamping1 = super.panjangPersegiPanjang * tinggiPrisma;
        return luasSisiSamping1;
    }
    public double hitungLuasSisiSamping2(){
        luasSisiSamping2 = super.lebarPersegiPanjang * tinggiPrisma;
        return luasSisiSamping2;
    }
    
}
