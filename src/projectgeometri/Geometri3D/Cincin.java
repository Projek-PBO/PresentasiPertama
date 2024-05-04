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
public class Cincin extends Bola {
    double tinggiCincin;
    double lebarCincin;
    double luasPermukaanCincin;
    double volumeCincin;

    public Cincin(double tinggiCincin, double lebarCincin, double jariJariLingkaran){
        super(jariJariLingkaran);
        this.tinggiCincin = tinggiCincin;
        this.lebarCincin = lebarCincin;
        super.hitungLuas();
    }

    public double hitungVolumeCincin(){
        volumeCincin = (super.luasLingkaran * tinggiCincin) - (Math.PI * Math.pow(super.jariJariLingkaran - lebarCincin, 2) * tinggiCincin);
        return volumeCincin;
    }

    public double hitungLuasPermukaanCincin(){
        luasPermukaanCincin = (super.luasLingkaran - (Math.PI * Math.pow(super.jariJariLingkaran - lebarCincin, 2))) + (Math.PI * (super.jariJariLingkaran * 2) * tinggiCincin) + (Math.PI * ((super.jariJariLingkaran - lebarCincin) * 2) * tinggiCincin);
        return luasPermukaanCincin;
    }
    
    public void tampilkanInfo(){
        System.out.println("Volume Cincin :" + this.volumeCincin);
        System.out.println("Luas Permukaan Cincin : " + this.luasPermukaanCincin);
    }

}
