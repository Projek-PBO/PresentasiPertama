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
public class Trapesium implements Benda2D{
    double sisiAtasTrapesium;
    double sisiBawahTrapesium;
    double tinggiTrapesium;
    double sisiMiringTrapesium;
    double luasTrapesium;
    double kelilingTrapesium;

    public Trapesium(double sisiAtasTrapesium, double sisiBawahTrapesium, double tinggiTrapesium) {
        this.sisiAtasTrapesium = sisiAtasTrapesium;
        this.sisiBawahTrapesium = sisiBawahTrapesium;
        this.tinggiTrapesium = tinggiTrapesium;
    }
    
    public Trapesium(double sisiAtasTrapesium, double sisiBawahTrapesium, double tinggiTrapesium, double sisiMiringTrapesium) {
        this.sisiAtasTrapesium = sisiAtasTrapesium;
        this.sisiBawahTrapesium = sisiBawahTrapesium;
        this.tinggiTrapesium = tinggiTrapesium;
        this.sisiMiringTrapesium = sisiMiringTrapesium;
    }
    
    public Trapesium(double sisiAtasTrapesium, double sisiBawahTrapesium, double tinggiTrapesium, double sisiMiringTrapesium, double luasTrapesium, double kelilingTrapesium) {
        this.sisiAtasTrapesium = sisiAtasTrapesium;
        this.sisiBawahTrapesium = sisiBawahTrapesium;
        this.tinggiTrapesium = tinggiTrapesium;
        this.sisiMiringTrapesium = sisiMiringTrapesium;
        this.luasTrapesium = luasTrapesium;
        this.kelilingTrapesium = kelilingTrapesium;
    }

    public double getSisiAtasTrapesium() {
        return sisiAtasTrapesium;
    }

    public void setSisiAtasTrapesium(double sisiAtasTrapesium) {
        this.sisiAtasTrapesium = sisiAtasTrapesium;
    }

    public double getSisiBawahTrapesium() {
        return sisiBawahTrapesium;
    }

    public void setSisiBawahTrapesium(double sisiBawahTrapesium) {
        this.sisiBawahTrapesium = sisiBawahTrapesium;
    }

    public double getTinggiTrapesium() {
        return tinggiTrapesium;
    }

    public void setTinggiTrapesium(double tinggiTrapesium) {
        this.tinggiTrapesium = tinggiTrapesium;
    }

    public double getSisiMiringTrapesium() {
        return sisiMiringTrapesium;
    }

    public void setSisiMiringTrapesium(double sisiMiringTrapesium) {
        this.sisiMiringTrapesium = sisiMiringTrapesium;
    }

    public double getLuasTrapesium() {
        return luasTrapesium;
    }

    public void setLuasTrapesium(double luasTrapesium) {
        this.luasTrapesium = luasTrapesium;
    }

    public double getKelilingTrapesium() {
        return kelilingTrapesium;
    }

    public void setKelilingTrapesium(double kelilingTrapesium) {
        this.kelilingTrapesium = kelilingTrapesium;
    }

    @Override
    public double hitungLuas() {
       luasTrapesium = (sisiAtasTrapesium+sisiBawahTrapesium)*tinggiTrapesium/2;
       return luasTrapesium;
    }

    @Override
    public double hitungKeliling() {
        kelilingTrapesium = sisiAtasTrapesium + sisiBawahTrapesium + tinggiTrapesium + sisiMiringTrapesium;
        return kelilingTrapesium;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Sisi atas trapesium : " + sisiAtasTrapesium);
        System.out.println("Sisi bawah trapesium : " + sisiBawahTrapesium);
        System.out.println("Tinggi trapesium : " + tinggiTrapesium);
        System.out.println("Sisi miring trapesium : " + sisiMiringTrapesium);
        System.out.println("Luas trapesium : " + luasTrapesium);
        System.out.println("Keliling trapesium : " + kelilingTrapesium);
    } 
}
