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
public class Tabung extends Lingkaran{
    double tinggiTabung;
    double selimutTabung;
    double luasPermukaanTabung;
    double volumeTabung;
    
    public Tabung(){
        this.tinggiTabung = 25.0;
    }
    
    public Tabung(double tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }

    public Tabung(double jariJariLingkaran, double tinggiTabung) {
        super(jariJariLingkaran);
        super.luasLingkaran = super.hitungLuas();
        this.tinggiTabung = tinggiTabung;
    } 
    
    public double hitungVolumeTabung(){
        volumeTabung = super.luasLingkaran * tinggiTabung;
        return volumeTabung;
    }
    
    public double hitungLuasPermukaanTabung(){
        luasPermukaanTabung = selimutTabung + 2 * super.luasLingkaran;
        return luasPermukaanTabung;
    }
    public double hitungSelimutTabung(){
        selimutTabung = 2*Math.PI*super.jariJariLingkaran*tinggiTabung;
        return selimutTabung;
    }
    public void tampilkanInfo(){
        System.out.println("Jari jari lingkaran tabung : " + super.jariJariLingkaran);
        System.out.println("Tinggi tabung : " + this.tinggiTabung);
        System.out.println("Luas selimut tabung : " + this.selimutTabung);
        System.out.println("Volume tabung : " + this.volumeTabung);
        System.out.println("Luas permukaan tabung : " + this.luasPermukaanTabung);
    }
}
