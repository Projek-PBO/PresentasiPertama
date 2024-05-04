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
public class BelahKetupat implements Benda2D{
    public double diagonalBelahKetupat1;
    public double diagonalBelahKetupat2;
    public double sisiMiring;
    public double luasBelahKetupat;
    public double kelilingBelahKetupat;
    
    public BelahKetupat(double diagonalBelahKetupat1, double diagonalBelahKetupat2){
        this.diagonalBelahKetupat1 = diagonalBelahKetupat1;
        this.diagonalBelahKetupat2 = diagonalBelahKetupat2;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Diagonal belah ketupat 1 : " + diagonalBelahKetupat1);
        System.out.println("Diagonal belah ketupat 2 : " + diagonalBelahKetupat2);
        System.out.println("Sisi miring : " + sisiMiring);
        System.out.println("Keliling Belah Ketupar : " + kelilingBelahKetupat);
        System.out.println("Luas Belah Ketupat : " + luasBelahKetupat);    
    }
    
    @Override
    public double hitungKeliling() {
        kelilingBelahKetupat = this.hitungSisiMiring() * 4;
        return kelilingBelahKetupat;
    }
    
    @Override
    public double hitungLuas() {
        luasBelahKetupat = (diagonalBelahKetupat1 * diagonalBelahKetupat2)/2;
        return luasBelahKetupat;
    }
    
    public double hitungSisiMiring(){
        sisiMiring = Math.sqrt(Math.pow(diagonalBelahKetupat1/2,2) + Math.pow(diagonalBelahKetupat2/2,2));
        return sisiMiring; 
    }
}
