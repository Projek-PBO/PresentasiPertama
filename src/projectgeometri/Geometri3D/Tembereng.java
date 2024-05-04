/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri.Geometri3D;

/**
 *
 * @author ASUS
 */
public class Tembereng extends Bola{

    double luasTembereng;
    double taliBusur;
    double kelilingTembereng;
    double derajatTembereng;

    public Tembereng(double jariJariLingkaran, double derajatTembereng){
        super(jariJariLingkaran);
        super.hitungKeliling();
        this.derajatTembereng = derajatTembereng;
        this.hitungTaliBusur();
    }

    public double hitungTaliBusur(){
        taliBusur = 2 * super.jariJariLingkaran * Math.sin(derajatTembereng/2);
        return taliBusur;
    }

    public double hitungLuasTembereng(){
        luasTembereng = (derajatTembereng / 360 * super.luasLingkaran) - (Math.sqrt(Math.pow(jariJariLingkaran, 2) - Math.pow(taliBusur / 2 , 2)) * taliBusur / 2);
        return luasTembereng;
    }

    public double hitungKelilingTembereng(){
        kelilingTembereng = taliBusur + (derajatTembereng / 360 * kelilingLingkaran);
        return kelilingTembereng;
    }
    
    public void tampilkanInfo(){
        System.out.println("Tali Busur Tembereng : " + this.taliBusur);
        System.out.println("Luas Tembereng : " + this.luasTembereng);
        System.out.println("Keliling Tembereng : " + this.kelilingTembereng);
    }
}
