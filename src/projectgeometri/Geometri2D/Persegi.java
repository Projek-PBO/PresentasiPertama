package projectgeometri.Geometri2D;
import projectgeometri.Benda2D;

public class Persegi implements Benda2D{
    public double sisiPersegi;
    public double luasPersegi;
    public double kelilingPersegi;

    public Persegi(){
        this.sisiPersegi = 10.0;
    }
    
    public Persegi(double sisiPersegi) {
        this.sisiPersegi = sisiPersegi;
    }

    @Override
    public double hitungLuas() {
        luasPersegi = sisiPersegi*sisiPersegi;
        return luasPersegi;
    }

    @Override
    public double hitungKeliling() {
        kelilingPersegi = 4*sisiPersegi;
        return kelilingPersegi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Sisi dari persegi : " + sisiPersegi);
        System.out.println("Keliling dari persegi : " + kelilingPersegi);
        System.out.println("Luas dari persegi : " + luasPersegi);
    }
    
//    public double hitungSisiDariLuas(){
//        sisiPersegi = Math.sqrt(luasPersegi);
//        return sisiPersegi;
//    }
//    
//    public double hitungSisiDariKeliling(){
//        sisiPersegi = kelilingPersegi/4;
//        return sisiPersegi;
//    }
}
