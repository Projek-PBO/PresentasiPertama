/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;
import projectgeometri.Geometri2D.Persegi;

/**
 *
 * @author ASUS
 */
public class Kubus extends Persegi{
    double luasPermukaanKubus;
    double volumeKubus;
    
    public Kubus(){
        super();
        super.luasPersegi = super.hitungLuas();
        super.kelilingPersegi = super.hitungKeliling();
    }
    
    public Kubus(double sisiPersegi) {
        super(sisiPersegi);
        super.luasPersegi = super.hitungLuas();
        super.kelilingPersegi = super.hitungKeliling();
    }

    public double hitungVolumeKubus(){
        volumeKubus = super.luasPersegi * super.sisiPersegi;
        return volumeKubus;
    }
    
    public double hitungLuasPermukaanKubus(){
        luasPermukaanKubus = 6 * super.luasPersegi;
        return luasPermukaanKubus;
    }
    
    public void tampilkanInfo(){
        System.out.println("Panjang rusuk kubus : " + super.sisiPersegi);
        System.out.println("Volume kubus : " + this.volumeKubus);
        System.out.println("Luas permukaan kubus : " + this.luasPermukaanKubus);
    }
}
