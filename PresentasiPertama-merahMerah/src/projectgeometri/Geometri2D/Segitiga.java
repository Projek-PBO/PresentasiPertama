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
    public double alasSegitiga;
    public double tinggiSegitiga;
    public double sisiSampingSegitiga;
    public double luasSegitiga;
    public double kelilingSegitiga;
    
    public Segitiga(){
        this.alasSegitiga = 3.0;
        this.tinggiSegitiga = 4.0;
    }
    
    public Segitiga(double alasSegitiga, double tinggiSegitiga) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
    }
    public double hitungSisiSamping(){
        sisiSampingSegitiga = Math.sqrt(Math.pow(alasSegitiga,2) + Math.pow(tinggiSegitiga,2));
        return sisiSampingSegitiga;
    }
    @Override
    public double hitungLuas() {
        luasSegitiga = (alasSegitiga * tinggiSegitiga)/2;
        return luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        kelilingSegitiga = alasSegitiga + tinggiSegitiga + this.hitungSisiSamping();
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
}
