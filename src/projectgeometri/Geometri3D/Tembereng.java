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
    
    // public Tembereng() {
    //     this.derajatTembereng = 30.0;
    // } 

    public Tembereng(double jariJariLingkaran){
        super(jariJariLingkaran);
    }

    public double hitungTaliBusur(){
        taliBusur = Math.sqrt(Math.pow(jariJariLingkaran, 2) + Math.pow(jariJariLingkaran, 2));
        return taliBusur;
    }

    public double hitungLuasTembereng(){
        // luasTembereng = (derajatTembereng / 360 * Math.PI * Math.pow(jariJariLingkaran, 2)) - (1 / 2 * jariJariLingkaran * jariJariLingkaran * taliBusur / jariJariLingkaran);
        
        luasTembereng = (derajatTembereng / 360 * Math.PI * Math.pow(jariJariLingkaran, 2)) - (Math.sqrt(Math.pow(jariJariLingkaran, 2) - Math.pow(taliBusur / 2 , 2)) * taliBusur / 2);
        return luasTembereng;
    }
}
