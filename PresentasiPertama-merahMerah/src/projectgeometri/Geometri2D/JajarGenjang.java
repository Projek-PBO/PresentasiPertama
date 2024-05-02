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
public class JajarGenjang implements Benda2D{
    public double alasJajarGenjang;
    public double tinggiJajarGenjang;
    public double sisiMiringJajarGenjang;
    public double luasJajarGenjang;
    public double kelilingJajarGenjang;

    public JajarGenjang() {
        this.alasJajarGenjang = 12.0;
        this.tinggiJajarGenjang = 9.0;
        this.sisiMiringJajarGenjang = 7.0;
    }
    
    public JajarGenjang(double alasJajarGenjang, double tinggiJajarGenjang, double sisiMiringJajarGenjang) {
        this.alasJajarGenjang = alasJajarGenjang;
        this.tinggiJajarGenjang = tinggiJajarGenjang;
        this.sisiMiringJajarGenjang = sisiMiringJajarGenjang;
    }
    
    @Override
    public double hitungLuas() {
        luasJajarGenjang = alasJajarGenjang * tinggiJajarGenjang;
        return luasJajarGenjang;
    }

    @Override
    public double hitungKeliling() {
        kelilingJajarGenjang = 2 * (alasJajarGenjang + sisiMiringJajarGenjang);
        return kelilingJajarGenjang;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("Alas jajar genjang = " + alasJajarGenjang);
        System.out.println("Tinggi jajar genjang = " + tinggiJajarGenjang);
        System.out.println("Sisi miring jajar genjang = " + sisiMiringJajarGenjang);
        System.out.println("Keliling jajar genjang = " + kelilingJajarGenjang);
        System.out.println("Luas jajar genjang = " + luasJajarGenjang);
    }
}
