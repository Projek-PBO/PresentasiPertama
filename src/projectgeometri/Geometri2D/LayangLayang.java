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
    }

    public LayangLayang(double diagonal1LayangLayang, double diagonal2LayangLayang,double sisiMiring1,double sisiMiring2) {
        this.diagonal1LayangLayang = diagonal1LayangLayang;
        this.diagonal2LayangLayang = diagonal2LayangLayang;
        this.sisiMiring1LayangLayang = sisiMiring1;
        this.sisiMiring2LayangLayang = sisiMiring2;
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
