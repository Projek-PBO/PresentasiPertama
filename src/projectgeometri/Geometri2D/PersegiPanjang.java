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
public class PersegiPanjang implements Benda2D{
    public double lebarPersegiPanjang;
    public double panjangPersegiPanjang;
    public double luasPersegiPanjang;
    public double kelilingPersegiPanjang;
    
    public PersegiPanjang(double lebarPersegiPanjang, double panjangPersegiPanjang) {
        this.lebarPersegiPanjang = lebarPersegiPanjang;
        this.panjangPersegiPanjang = panjangPersegiPanjang;
    }

    @Override
    public double hitungLuas() {
        luasPersegiPanjang = lebarPersegiPanjang*panjangPersegiPanjang;
        return luasPersegiPanjang;
    }

    @Override
    public double hitungKeliling() {
        kelilingPersegiPanjang = 2*(lebarPersegiPanjang + panjangPersegiPanjang);
        return kelilingPersegiPanjang;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Lebar persegi panjang : " + lebarPersegiPanjang);
        System.out.println("Panjang persegi panjang : " + panjangPersegiPanjang);
        System.out.println("Keliling persegi panjang : " + kelilingPersegiPanjang);
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang);
    }
    
}
