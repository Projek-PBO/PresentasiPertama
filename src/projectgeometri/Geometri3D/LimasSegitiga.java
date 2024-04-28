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
public class LimasSegitiga extends Segitiga{
    double tinggiLimas;
    double luasSisiMiring;
    double volumeLimas;
    double luasPermukaanLimas;
    
    public double hitungVolumeLimas(){
        volumeLimas = 1/3 * super.luasSegitiga * tinggiLimas;
        return volumeLimas;
    }
    public double hitungLuasPermukaanLimas(){
        luasPermukaanLimas = super.luasSegitiga + 3 * luasSisiMiring;
        return luasPermukaanLimas;
    }
    public double hitungLuasSisiMiring(){
        luasSisiMiring = 1/2 * super.alasSegitiga * tinggiLimas;
        return luasSisiMiring;
    }
    
}
