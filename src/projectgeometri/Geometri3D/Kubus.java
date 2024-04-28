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
    double sisiKubus;
    double luasPermukaanKubus;
    double volumeKubus;

    public Kubus(double sisiKubus) {
        this.sisiKubus = sisiKubus;
    }
    
    public Kubus(double sisiKubus, double luasPermukaanKubus, double volumeKubus) {
        this.sisiKubus = sisiKubus;
        this.luasPermukaanKubus = luasPermukaanKubus;
        this.volumeKubus = volumeKubus;
    }

    public double getSisiKubus() {
        return sisiKubus;
    }

    public void setSisiKubus(double sisiKubus) {
        this.sisiKubus = sisiKubus;
    }

    public double getLuasPermukaanKubus() {
        return luasPermukaanKubus;
    }

    public void setLuasPermukaanKubus(double luasPermukaanKubus) {
        this.luasPermukaanKubus = luasPermukaanKubus;
    }

    public double getVolumeKubus() {
        return volumeKubus;
    }

    public void setVolumeKubus(double volumeKubus) {
        this.volumeKubus = volumeKubus;
    }
    
    public double hitungVolumeKubus(){
        volumeKubus = super.luasPersegi * super.sisiPersegi;
        return volumeKubus;
    }
    public double hitungVolumeKubus(double sisi){
        volumeKubus = Math.pow(sisi,3);
        return volumeKubus;
    }
    public double hitungLuasPermukaanKubus(){
        luasPermukaanKubus = 6 * super.luasPersegi;
        return luasPermukaanKubus;
    }
    public double hitungLuasPermukaanKubus(double sisi){
        luasPermukaanKubus = 6 * (sisi * sisi);
        return luasPermukaanKubus;
    }
}
