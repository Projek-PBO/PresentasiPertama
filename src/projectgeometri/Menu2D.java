/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri;

import java.util.Scanner;
import projectgeometri.Geometri2D.BelahKetupat;
import projectgeometri.Geometri2D.Ellips;
import projectgeometri.Geometri2D.JajarGenjang;
import projectgeometri.Geometri2D.LayangLayang;
import projectgeometri.Geometri2D.Lingkaran;
import projectgeometri.Geometri2D.Persegi;
import projectgeometri.Geometri2D.PersegiPanjang;
import projectgeometri.Geometri2D.Segitiga;
import projectgeometri.Geometri2D.Trapesium;

/**
 *
 * @author ASUS
 */
public class Menu2D {
    public int pilihan;
    public void membuatMenu2D(){
        double param1, param2, param3, param4;
        Scanner input = new Scanner(System.in);
        System.out.println("Program untuk mencari luas dan keliling geometri 2D");
        System.out.println("Berikut pilihan geometri 2 dimensi");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Belah Ketupat");
        System.out.println("7. Layang Layang");
        System.out.println("8. Ellips");
        System.out.println("9. Lingkaran");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1 : 
                System.out.print("Masukkan alas Segitiga : ");
                param1 = input.nextDouble();
                System.out.print ("Masukkan tinggi Segitiga : ");
                param2 = input.nextDouble();
                Segitiga segitiga = new Segitiga(param1,param2);
                segitiga.hitungLuas();
                segitiga.hitungKeliling();
                segitiga.hitungSisiSamping();
                segitiga.tampilkanInfo();
                break;
            case 2 : 
                System.out.print("Masukkan sisi persegi : ");
                param1 = input.nextDouble();
                Persegi persegi = new Persegi(param1);
                persegi.hitungLuas();
                persegi.hitungKeliling();
                persegi.tampilkanInfo();
                break;
            case 3 : 
                System.out.print("Masukkan lebar persegi panjang : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan panjang persegi panjang : ");
                param2 = input.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(param1, param2);
                persegiPanjang.hitungLuas();
                persegiPanjang.hitungKeliling();
                persegiPanjang.tampilkanInfo();
                break;
            case 4 : 
                System.out.print("Masukkan alas jajar genjang : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan tinggi jajar genjang : ");
                param2 = input.nextDouble();
                System.out.print("Masukkan sisi miring jajar genjang : ");
                param3 = input.nextDouble();
                JajarGenjang jajarGenjang = new JajarGenjang(param1,param2,param3);
                jajarGenjang.hitungLuas();
                jajarGenjang.hitungKeliling();
                jajarGenjang.tampilkanInfo();
                break;
            case 5 : 
                System.out.print("Masukkan sisi atas trapesium : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium : ");
                param2 = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium : ");
                param3 = input.nextDouble();
                Trapesium trapesium = new Trapesium(param1, param2, param3);
                trapesium.hitungLuas();
                trapesium.hitungKeliling();
                trapesium.tampilkanInfo();
                break;
            case 6 : 
                System.out.print("Masukkan diagonal 1 belah ketupat : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 belah ketupat : ");
                param2 = input.nextDouble();
                BelahKetupat belahKetupat = new BelahKetupat(param1,param2);
                belahKetupat.hitungLuas();
                belahKetupat.hitungKeliling();
                belahKetupat.tampilkanInfo();
                break;
            case 7 : 
                System.out.print("Masukkan diagonal 1 layang layang : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 layang layang : ");
                param2 = input.nextDouble();
                System.out.print("Masukkan sisi miring 1 layang layang : ");
                param3 = input.nextDouble();
                System.out.print("Masukkan sisi miring 2 layang layang : ");
                param4 = input.nextDouble();
                LayangLayang layangLayang = new LayangLayang(param1,param2,param3,param4);
                layangLayang.hitungLuas();
                layangLayang.hitungKeliling();
                layangLayang.tampilkanInfo();
                break;
            case 8 : 
                System.out.print("Masukkan sumbu minor ellips : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan sumbu mayor ellips : ");
                param2 = input.nextDouble();
                Ellips ellips = new Ellips(param1, param2);
                ellips.hitungLuas();
                ellips.hitungKeliling();
                ellips.tampilkanInfo();
                break;
            case 9 : 
                System.out.print("Masukkan jari-jari lingkaran : ");
                param1 = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(param1);
                lingkaran.hitungLuas();
                lingkaran.hitungKeliling();
                lingkaran.tampilkanInfo();
                break;
        }
    }
}
