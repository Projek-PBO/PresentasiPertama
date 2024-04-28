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
public class Lingkaran implements Benda2D{
    public double jariJariLingkaran;
    public double luasLingkaran;
    public double kelilingLingkaran;
    
    public Lingkaran(){
        this.jariJariLingkaran = 10.0;
        this.luasLingkaran = this.hitungLuas();
        this.kelilingLingkaran = this.hitungKeliling();
    }

    public Lingkaran(double jariJariLingkaran) {
        this.jariJariLingkaran = jariJariLingkaran;
        this.luasLingkaran = this.hitungLuas();
        this.kelilingLingkaran = this.hitungKeliling();
    }

    public double getJariJariLingkaran() {
        return jariJariLingkaran;
    }

    public void setJariJariLingkaran(double jariJariLingkaran) {
        this.jariJariLingkaran = jariJariLingkaran;
    }

    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    public void setLuasLingkaran(double luasLingkaran) {
        this.luasLingkaran = luasLingkaran;
    }

    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }

    public void setKelilingLingkaran(double kelilingLingkaran) {
        this.kelilingLingkaran = kelilingLingkaran;
    }
    

    @Override
    public double hitungLuas() {
        luasLingkaran = Math.PI * Math.pow(jariJariLingkaran, 2);
        return luasLingkaran;
    }

    @Override
    public double hitungKeliling() {
        kelilingLingkaran = 2 * Math.PI * jariJariLingkaran;
        return kelilingLingkaran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jari-jari Lingkaran : " + jariJariLingkaran);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
        System.out.println("Keliling Lingkaran" + kelilingLingkaran);
    }
    
}