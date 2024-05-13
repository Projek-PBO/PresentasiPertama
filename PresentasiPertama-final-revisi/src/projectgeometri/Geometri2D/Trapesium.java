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
    public double sisiAtasTrapesium;
    public double sisiBawahTrapesium;
    public double tinggiTrapesium;
    public double sisiMiringTrapesium;
    public double luasTrapesium;
    public double kelilingTrapesium;
    
    public Trapesium(double sisiAtasTrapesium, double sisiBawahTrapesium, double tinggiTrapesium) {
        this.sisiAtasTrapesium = sisiAtasTrapesium;
        this.sisiBawahTrapesium = sisiBawahTrapesium;
        this.tinggiTrapesium = tinggiTrapesium;
    }

    @Override
    public double hitungLuas() {
        luasTrapesium = (sisiAtasTrapesium+sisiBawahTrapesium)*tinggiTrapesium/2;
        return luasTrapesium;
    }

    @Override
    public double hitungKeliling() {
        kelilingTrapesium = sisiAtasTrapesium + sisiBawahTrapesium + tinggiTrapesium + this.hitungSisiMiring();
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
    
    public double hitungSisiMiring(){
        sisiMiringTrapesium = Math.sqrt(Math.pow((sisiBawahTrapesium - sisiAtasTrapesium),2)+Math.pow(tinggiTrapesium,2));
        return sisiMiringTrapesium;
    }
}
