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
public class LayangLayang implements Benda2D{
    public double diagonal1LayangLayang;
    public double diagonal2LayangLayang;
    public double sisiMiring1LayangLayang;
    public double sisiMiring2LayangLayang;
    public double luasLayangLayang;
    public double kelilingLayangLayang;
    
    public LayangLayang(){
        this.diagonal1LayangLayang = 24.0;
        this.diagonal2LayangLayang = 40.0;
        this.sisiMiring1LayangLayang = 13.0;
        this.sisiMiring2LayangLayang = 37.0;
        this.kelilingLayangLayang = this.hitungKeliling();
        this.luasLayangLayang = this.hitungLuas();
    }

    public LayangLayang(double diagonal1LayangLayang, double diagonal2LayangLayang,double sisiMiring1,double sisiMiring2) {
        this.diagonal1LayangLayang = diagonal1LayangLayang;
        this.diagonal2LayangLayang = diagonal2LayangLayang;
        this.sisiMiring1LayangLayang = sisiMiring1;
        this.sisiMiring2LayangLayang = sisiMiring2;
        this.kelilingLayangLayang = this.hitungKeliling();
        this.luasLayangLayang = this.hitungLuas();
    }

    public double getDiagonal1LayangLayang() {
        return diagonal1LayangLayang;
    }

    public void setDiagonal1LayangLayang(double diagonal1LayangLayang) {
        this.diagonal1LayangLayang = diagonal1LayangLayang;
    }

    public double getDiagonal2LayangLayang() {
        return diagonal2LayangLayang;
    }

    public void setDiagonal2LayangLayang(double diagonal2LayangLayang) {
        this.diagonal2LayangLayang = diagonal2LayangLayang;
    }

    public double getSisi1LayangLayang() {
        return sisiMiring1LayangLayang;
    }

    public void setSisi1LayangLayang(double sisi1LayangLayang) {
        this.sisiMiring1LayangLayang = sisi1LayangLayang;
    }

    public double getSisi2LayangLayang() {
        return sisiMiring2LayangLayang;
    }

    public void setSisi2LayangLayang(double sisi2LayangLayang) {
        this.sisiMiring2LayangLayang = sisi2LayangLayang;
    }

    public double getLuasLayangLayang() {
        return luasLayangLayang;
    }

    public void setLuasLayangLayang(double luasLayangLayang) {
        this.luasLayangLayang = luasLayangLayang;
    }

    public double getKelilingLayangLayang() {
        return kelilingLayangLayang;
    }

    public void setKelilingLayangLayang(double kelilingLayangLayang) {
        this.kelilingLayangLayang = kelilingLayangLayang;
    }
    
    @Override
    public double hitungLuas() {
        luasLayangLayang = diagonal1LayangLayang * diagonal2LayangLayang / 2;
        return luasLayangLayang;
    }

    @Override
    public double hitungKeliling() {
        kelilingLayangLayang = 2 * (sisiMiring1LayangLayang + sisiMiring2LayangLayang);
        return kelilingLayangLayang;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Diagonal 1 layang layang = " + diagonal1LayangLayang);
        System.out.println("Diagonal 2 layang layang = " + diagonal2LayangLayang);
        System.out.println("Sisi miring 1 layang layang = " + sisiMiring1LayangLayang);
        System.out.println("Sisi miring 2 layang layang = " + sisiMiring2LayangLayang);
        System.out.println("Luas layang layang = " + luasLayangLayang);
        System.out.println("Keliling miring 2 layang layang = " + kelilingLayangLayang);
    }  
}
