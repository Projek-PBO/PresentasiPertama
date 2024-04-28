/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri2D;
import projectgeometri.Benda2D;

/**
 *
 * @author ASUS
 */
public class Persegi implements Benda2D{
    public double sisiPersegi;
    public double luasPersegi;
    public double kelilingPersegi;

    public Persegi(){
        this.sisiPersegi = 10.0;
        this.luasPersegi = this.hitungLuas();
        this.kelilingPersegi = this.hitungKeliling();
    }
    
    public Persegi(double sisiPersegi) {
        this.sisiPersegi = sisiPersegi;
        this.luasPersegi = this.hitungLuas();
        this.kelilingPersegi = this.hitungKeliling();
    }

    public double getSisi() {
        return sisiPersegi;
    }

    public void setSisi(double sisi) {
        this.sisiPersegi = sisiPersegi;
    }

    public double getLuas() {
        return luasPersegi;
    }

    public void setLuas(double luas) {
        this.luasPersegi = luasPersegi;
    }

    public double getKeliling() {
        return kelilingPersegi;
    }

    public void setKeliling(double keliling) {
        this.kelilingPersegi = kelilingPersegi;
    }

    @Override
    public double hitungLuas() {
        luasPersegi = sisiPersegi*sisiPersegi;
        return luasPersegi;
    }

    @Override
    public double hitungKeliling() {
        kelilingPersegi = 4*sisiPersegi;
        return kelilingPersegi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Sisi dari persegi : " + sisiPersegi);
        System.out.println("Keliling dari persegi : " + kelilingPersegi);
        System.out.println("Luas dari persegi : " + luasPersegi);
    }
    
//    public double hitungSisiDariLuas(){
//        sisiPersegi = Math.sqrt(luasPersegi);
//        return sisiPersegi;
//    }
//    
//    public double hitungSisiDariKeliling(){
//        sisiPersegi = kelilingPersegi/4;
//        return sisiPersegi;
//    }
}
