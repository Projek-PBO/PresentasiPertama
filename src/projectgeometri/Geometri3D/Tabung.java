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
    double jariJariTabung;
    double tinggiTabung;
    double selimutTabung;
    double luasPermukaanTabung;
    double volumeTabung;
    double luasAlasTabung;

    public Tabung(double jariJariTabung, double tinggiTabung, double selimutTabung, double luasPermukaanTabung, double volumeTabung, double luasAlasTabung) {
        this.jariJariTabung = jariJariTabung;
        this.tinggiTabung = tinggiTabung;
        this.selimutTabung = selimutTabung;
        this.luasPermukaanTabung = luasPermukaanTabung;
        this.volumeTabung = volumeTabung;
        this.luasAlasTabung = luasAlasTabung;
    }

    public double getJariJariTabung() {
        return jariJariTabung;
    }

    public void setJariJariTabung(double jariJariTabung) {
        this.jariJariTabung = jariJariTabung;
    }

    public double getTinggiTabung() {
        return tinggiTabung;
    }

    public void setTinggiTabung(double tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }

    public double getSelimutTabung() {
        return selimutTabung;
    }

    public void setSelimutTabung(double selimutTabung) {
        this.selimutTabung = selimutTabung;
    }

    public double getLuasPermukaanTabung() {
        return luasPermukaanTabung;
    }

    public void setLuasPermukaanTabung(double luasPermukaanTabung) {
        this.luasPermukaanTabung = luasPermukaanTabung;
    }

    public double getVolumeTabung() {
        return volumeTabung;
    }

    public void setVolumeTabung(double volumeTabung) {
        this.volumeTabung = volumeTabung;
    }

    public double getLuasAlasTabung() {
        return luasAlasTabung;
    }

    public void setLuasAlasTabung(double luasAlasTabung) {
        this.luasAlasTabung = luasAlasTabung;
    }
    
    public double hitungVolumeTabung(){
        volumeTabung = super.luasLingkaran * tinggiTabung;
        return volumeTabung;
    }
    
    public double hitungLuasPermukaanTabung(){
        luasPermukaanTabung = selimutTabung + 2 * luasAlasTabung;
        return luasPermukaanTabung;
    }
}
