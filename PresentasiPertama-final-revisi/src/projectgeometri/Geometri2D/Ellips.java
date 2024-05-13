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
public class Ellips implements Benda2D{
    public double sumbuMinor;
    public double sumbuMayor;
    public double luasEllips;
    public double kelilingEllips;

    public Ellips(double sumbuMinor, double sumbuMayor) {
        this.sumbuMinor = sumbuMinor;
        this.sumbuMayor = sumbuMayor;
    }

    @Override
    public double hitungLuas() {
        luasEllips = Math.PI * sumbuMinor * sumbuMayor;
        return luasEllips;
    }

    @Override
    public double hitungKeliling() {
        kelilingEllips = 2 * Math.PI * Math.sqrt((Math.pow(sumbuMayor,2)+Math.pow(sumbuMinor,2))/2);
        return kelilingEllips;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Sumbu minor ellips : "+ sumbuMinor);
        System.out.println("Sumbu mayor ellips : "+ sumbuMayor);
        System.out.println("Keliling ellips : "+ kelilingEllips);
        System.out.println("Luas ellips : "+ luasEllips);
    }
    
}
