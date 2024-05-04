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
    double luasJuring;
    double kelilingJuring;

    public Juring(double derajatJuring, double jariJariLingkaran){
        super(jariJariLingkaran);
        this.derajatJuring = derajatJuring;
        super.hitungLuas();
        super.hitungKeliling();
    }
    
    public double hitungLuasJuring(){
        luasJuring = derajatJuring / 360 * super.luasLingkaran;
        return luasJuring;
    }

    public double hitungKelilingJuring(){
        kelilingJuring = derajatJuring / 360 * super.kelilingLingkaran + 2 * super.jariJariLingkaran;
        return kelilingJuring;
    }
    
    public void tampilkanInfo(){
        System.out.println("Luas Juring : " + this.luasJuring) ;
        System.out.println("Keliling Juring : " + this.kelilingJuring);
    }
}
