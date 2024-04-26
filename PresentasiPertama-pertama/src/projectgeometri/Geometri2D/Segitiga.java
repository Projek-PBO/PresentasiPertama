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
public class Segitiga implements Benda2D{
    double alasSegitiga;
    double tinggiSegitiga;
    double sisiSampingSegitiga;
    double luasSegitiga;
    double kelilingSegitiga;
    
    public Segitiga(double alasSegitiga, double tinggiSegitiga) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public Segitiga(double alasSegitiga, double tinggiSegitiga, double luasSegitiga, double kelilingSegitiga) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
        this.luasSegitiga = luasSegitiga;
        this.kelilingSegitiga = kelilingSegitiga;
    }

    public double getAlasSegitiga() {
        return alasSegitiga;
    }

    public void setAlasSegitiga(double alasSegitiga) {
        this.alasSegitiga = alasSegitiga;
    }

    public double getTinggiSegitiga() {
        return tinggiSegitiga;
    }

    public void setTinggiSegitiga(double tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double getSisiSampingSegitiga() {
        return sisiSampingSegitiga;
    }

    public void setSisiSampingSegitiga(double sisiSampingSegitiga) {
        this.sisiSampingSegitiga = sisiSampingSegitiga;
    }

    public double getLuasSegitiga() {
        return luasSegitiga;
    }

    public void setLuasSegitiga(double luasSegitiga) {
        this.luasSegitiga = luasSegitiga;
    }

    public double getKelilingSegitiga() {
        return kelilingSegitiga;
    }

    public void setKelilingSegitiga(double kelilingSegitiga) {
        this.kelilingSegitiga = kelilingSegitiga;
    }

    @Override
    public double hitungLuas() {
        luasSegitiga = (alasSegitiga * tinggiSegitiga)/2;
        return luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        
        kelilingSegitiga = alasSegitiga + tinggiSegitiga + sisiSampingSegitiga;
        return kelilingSegitiga;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Alas segitiga : " + alasSegitiga);
        System.out.println("Tinggi segitiga : " + tinggiSegitiga);
        System.out.println("Sisi samping segitiga : " + sisiSampingSegitiga);
        System.out.println("Keliling segitiga : " + kelilingSegitiga);
        System.out.println("Luas segitiga : " + luasSegitiga);
    }
    
    public double hitungSisiSamping(){
        sisiSampingSegitiga = Math.sqrt(Math.pow(alasSegitiga,2) + Math.pow(tinggiSegitiga,2));
        return sisiSampingSegitiga;
    }
}
