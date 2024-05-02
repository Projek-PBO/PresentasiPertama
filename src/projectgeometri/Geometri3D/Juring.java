/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

/**
 *
 * @author ASUS
 */
public class Juring extends Bola{

    double derajatJuring;
    double luasPermukaanJuring;
    double kelilingJuring;

    // public Juring(){
    //     this.derajatJuring = 90.0;
    // }

    // public Juring(double derajatJuring){
    //     this.derajatJuring = derajatJuring;
    // }

    public Juring(double derajatJuring, double luasLingkaran){
        super(luasLingkaran);
        this.derajatJuring = derajatJuring;
    }

    // public Juring(double derajatJuring, double luasLingkaran, double kelilingLingkaran){
    //     super(luasLingkaran, kelilingLingkaran);
    //     this.derajatJuring = derajatJuring;
    // }
    
    public double hitungLuasPermukaanJuring(){
        luasPermukaanJuring = derajatJuring / 360 * super.luasLingkaran;
        return luasPermukaanJuring;
    }

    public double hitungKelilingJuring(){
        kelilingJuring = derajatJuring / 360 * super.kelilingLingkaran;
        return kelilingJuring;
    }
    
}
