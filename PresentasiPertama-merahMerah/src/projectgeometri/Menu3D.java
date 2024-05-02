/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri;

import java.util.Scanner;
import projectgeometri.Geometri3D.Balok;
import projectgeometri.Geometri3D.Bola;
import projectgeometri.Geometri3D.Cincin;
import projectgeometri.Geometri3D.Kerucut;
import projectgeometri.Geometri3D.Kubus;
import projectgeometri.Geometri3D.LimasPersegi;
import projectgeometri.Geometri3D.LimasPersegiPanjang;
import projectgeometri.Geometri3D.LimasSegitiga;
import projectgeometri.Geometri3D.PrismaPersegi;
import projectgeometri.Geometri3D.PrismaPersegiPanjang;
import projectgeometri.Geometri3D.PrismaSegitiga;
import projectgeometri.Geometri3D.Tabung;
import projectgeometri.Geometri3D.Tembereng;

/**
 *
 * @author ASUS
 */
public class Menu3D {
    int pilihan;
    public void membuatMenu3d(){
        double param1,param2,param3;
        Scanner input = new Scanner(System.in);
        System.out.println("Program untuk mencari volume dan luas permukaan geometri 3D");
        System.out.println("Berikut pilihan geometri 3 dimensi");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Bola");
        System.out.println("5. Kerucut");
        System.out.println("6. Prisma Segitiga");
        System.out.println("7. Prisma Persegi");
        System.out.println("8. Prisma Persegi Panjang");
        System.out.println("9. Limas Segitiga");
        System.out.println("10. Limas Persegi");
        System.out.println("11. Limas Persegi Panjang");
        System.out.println("12. Kerucut Terpancung");
        System.out.println("13. Tembereng");
        System.out.println("14. Juring");
        System.out.println("15. Cincin");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1 : 
                System.out.print("Masukkan panjang rusuk kubus : ");
                param1 = input.nextDouble();
                Kubus kubus = new Kubus(param1);
                kubus.hitungVolumeKubus();
                kubus.hitungLuasPermukaanKubus();
                kubus.tampilkanInfo();
                break;
            case 2 : 
                System.out.print("Masukkan panjang balok : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan lebar balok : ");
                param2 = input.nextDouble();
                System.out.print("Masukkan tinggi balok : ");
                param3 = input.nextDouble();
                Balok balok = new Balok(param1,param2,param3);
                balok.hitungVolumeBalok();
                balok.hitungLuasPermukaanBalok();
                balok.tampilkanInfo();
                break;
            case 3 : 
                System.out.print("Masukkan jari jari tabung : ");
                param1 = input.nextDouble();
                System.out.print("Masukkan tinggi tabung : ");
                param2 = input.nextDouble();
                Tabung tabung = new Tabung(param1, param2);
                tabung.hitungSelimutTabung();
                tabung.hitungVolumeTabung();
                tabung.hitungLuasPermukaanTabung();
                tabung.tampilkanInfo();
                break;
            case 4 : 
                System.out.print("Masukkan jari-jari bola : ");
                param1 = input.nextDouble();
                Bola bola = new Bola(param1);
                bola.hitungVolumeBola();
                bola.hitungLuasPermukaanBola();
                bola.tampilkanInfo();
                break;
            case 5 : 
                System.out.print("Masukkan Tinggi Kerucut : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Alas Jari-jari Kerucut : ");
                param2 = input.nextDouble();
                Kerucut kerucut = new Kerucut(param1, param2);
                kerucut.hitungVolumeKerucut();
                kerucut.hitungLuasPermukaanKerucut();
                kerucut.tampilkanInfo();
                break;
            case 6 :
                System.out.println("Masukkan Alas Prisma Segitiga : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Tinggi Alas Prisma Segitiga : ");
                param2 = input.nextDouble();
                System.out.println("Masukkan Tinggi Tinggi Prisma Segitiga : ");
                param3 = input.nextDouble();
                PrismaSegitiga prismasegitiga = new PrismaSegitiga(param1, param2, param3);
                prismasegitiga.hitungVolumePrisma();
                prismasegitiga.hitungLuasPermukaanPrisma();
                prismasegitiga.tampilkanInfo();
                break;
            case 7 : 
                System.out.println("Masukkan Alas Sisi Prisma Persegi : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Tinggi Prisma Persegi : ");
                param2 = input.nextDouble();
                PrismaPersegi prismapersegi = new PrismaPersegi(param1, param2);
                prismapersegi.hitungVolumePrismaPersegi();
                prismapersegi.hitungLuasPermukaanPrismaPersegi();
                prismapersegi.tampilkanInfo();
                break;
            case 8 :
                System.out.println("Masukkan Lebar Alas Prisma Persegi Panjang : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Panjang Alas Prisma Persegi Panjang : ");
                param2 = input.nextDouble();
                System.out.println("Masukkan Tinggi Prisma Persegi Panjang : ");
                param3 = input.nextDouble();
                PrismaPersegiPanjang prismapersegipanjang = new PrismaPersegiPanjang(param1, param2, param3);
                prismapersegipanjang.hitungVolume();
                prismapersegipanjang.hitungLuasPermukaanPrisma();
                prismapersegipanjang.tampilkanInfo();
                break;
            case 9 :
                System.out.println("Masukkan Alas Limas Segitiga : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Tinggi Alas Limas Segitiga : ");
                param2 = input.nextDouble();
                System.out.println("Masukkan Tinggi Limas Segitiga : ");
                param3 = input.nextDouble();
                LimasSegitiga limassegitiga = new LimasSegitiga(param1, param2, param3);
                limassegitiga.hitungVolumeLimas();
                limassegitiga.hitungLuasPermukaanLimas();
                limassegitiga.tampilkanInfo();
                break;
            case 10 : 
                System.out.println("Masukkan Sisi Alas Limas Persegi : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Tinggi Limas Persegi : ");
                param2 = input.nextDouble();
                LimasPersegi limaspersegi = new LimasPersegi(param1, param2);
                limaspersegi.hitungVolumeLimas();
                limaspersegi.hitungLuasPermukaan();
                limaspersegi.tampilkanInfo();
                break;
            case 11 :
                System.out.println("Masukkan Panjang Alas Limas Persegi Panjang : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Lebar Alas Limas Persegi Panjang : ");
                param2 = input.nextDouble();
                System.out.println("Masukkan Tinggi Limas Persegi Panjang : ");
                param3 = input.nextDouble();
                LimasPersegiPanjang limaspersegipanjang = new LimasPersegiPanjang(param1, param2, param3);
                limaspersegipanjang.hitungVolumeLimas();
                limaspersegipanjang.hitungLuasPermukaanLimas();
                limaspersegipanjang.tampilkanInfo();
                break;
            case 12 :
                System.out.println("");
            case 13 :
                System.out.println("Masukkan Jari-Jari Tembereng : ");
                param1 = input.nextDouble();
                Tembereng tembereng = new Tembereng (param1);
                tembereng.hitungLuasTembereng();
                tembereng.tampilkanInfo();
                break;
            case 14 :
                System.out.println("Masukkan ");
                break;
            case 15 :
                System.out.println("Masukkan Tinggi Cincin : ");
                param1 = input.nextDouble();
                System.out.println("Masukkan Lebbar Cincin : ");
                param2 = input.nextDouble();
                System.out.println("Masukkan Jari-Jari Cincin : ");
                param3 = input.nextDouble();
                Cincin cincin = new Cincin(param1, param2, param3);
                cincin.hitungVolumeCincin();
                cincin.hitungLuasPermukaanCincin();
                cincin.tampilkanInfo();
                break;
        }
    }
    
}
