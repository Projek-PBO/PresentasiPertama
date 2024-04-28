/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

import projectgeometri.Geometri2D.Lingkaran;

/**
 *
 * @author ASUS
 */
public class Bola extends Lingkaran{
    double volumeBola;
    double luasPermukaanBola;
    
    public double hitungVolumeBola(){
        volumeBola = 4/3 * super.luasLingkaran * super.jariJariLingkaran;
        return volumeBola;
    }
    
    public double hitungLuasPermukaanBola(){
        luasPermukaanBola = 4 * super.luasLingkaran;
        return luasPermukaanBola;
    }
    
}
