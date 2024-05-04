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

    public Bola(double jariJariLingkaran) {
        super(jariJariLingkaran);
        super.hitungLuas();
    }
    
    public double hitungVolumeBola(){
        volumeBola = (4 * super.luasLingkaran * super.jariJariLingkaran)/3;
        return volumeBola;
    }
    
    public double hitungLuasPermukaanBola(){
        luasPermukaanBola = 4 * super.luasLingkaran;
        return luasPermukaanBola;
    }
    
    public void tampilkanInfo(){
        System.out.println("Jari jari bola : " + super.jariJariLingkaran);
        System.out.println("Volume bola : " + this.volumeBola);
        System.out.println("Luas permukaan bola : " + this.luasPermukaanBola);
    }
}
