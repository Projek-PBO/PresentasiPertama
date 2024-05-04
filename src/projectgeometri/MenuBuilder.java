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
import projectgeometri.Geometri3D.Balok;
import projectgeometri.Geometri3D.Bola;
import projectgeometri.Geometri3D.Cincin;
import projectgeometri.Geometri3D.Juring;
import projectgeometri.Geometri3D.Kerucut;
import projectgeometri.Geometri3D.KerucutTerpancung;
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
public class MenuBuilder {
    public void membuatMenuUtama(){
        int pilihan;
        try {
        Scanner input = new Scanner(System.in); 
        do {
            System.out.println("== MENU UTAMA ==");
            System.out.println("1. Hitung Luas dan Keliling Bangun Datar");
            System.out.println("2. Hitung Volume dan Luas Permukaan Bangun Ruang");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    membuatMenuBangunDatar();
                    break;
                case 2:
                    membuatMenuBangunRuang();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }  
            System.out.println();
        } while (pilihan != 3);
        } catch (Exception e) {
            System.out.println("Input yang dimasukkan bukan angka.");
            this.membuatMenuUtama();
        }
    }
    
    public static void membuatMenuBangunDatar(){
        int pilihan;
        double param1, param2, param3, param4;
        try {
        Scanner input = new Scanner(System.in);        
        do {
            System.out.println("== MENU BANGUN DATAR ==");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Jajar Genjang");
            System.out.println("5. Trapesium");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Layang Layang");
            System.out.println("8. Ellips");
            System.out.println("9. Lingkaran");
            System.out.println("10. Kembali ke Menu Utama");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            switch (pilihan) {
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
                default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 10);
        } catch (Exception e) {
            System.out.println("Input yang dimasukkan bukan angka.");
        }
    }
    
    public static void membuatMenuBangunRuang() {
        int pilihan;
        double param1, param2, param3;
        Scanner input = new Scanner(System.in);
        try{
        do {
            System.out.println("== MENU BANGUN RUANG ==");
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
            System.out.println("16. Kembali ke Menu Utama");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
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
                    System.out.print("Masukkan Alas Jari-jari Kerucut : ");
                    param2 = input.nextDouble();
                    Kerucut kerucut = new Kerucut(param1, param2);
                    kerucut.hitungVolumeKerucut();
                    kerucut.hitungLuasPermukaanKerucut();
                    kerucut.tampilkanInfo();
                    break;
                case 6 :
                    System.out.print("Masukkan Alas Prisma Segitiga : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Alas Prisma Segitiga : ");
                    param2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Tinggi Prisma Segitiga : ");
                    param3 = input.nextDouble();
                    PrismaSegitiga prismasegitiga = new PrismaSegitiga(param1, param2, param3);
                    prismasegitiga.hitungVolumePrisma();
                    prismasegitiga.hitungLuasPermukaanPrisma();
                    prismasegitiga.tampilkanInfo();
                    break;
                case 7 : 
                    System.out.print("Masukkan Alas Sisi Prisma Persegi : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Prisma Persegi : ");
                    param2 = input.nextDouble();
                    PrismaPersegi prismapersegi = new PrismaPersegi(param1, param2);
                    prismapersegi.hitungVolumePrismaPersegi();
                    prismapersegi.hitungLuasPermukaanPrismaPersegi();
                    prismapersegi.tampilkanInfo();
                    break;
                case 8 :
                    System.out.print("Masukkan Lebar Alas Prisma Persegi Panjang : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Panjang Alas Prisma Persegi Panjang : ");
                    param2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Prisma Persegi Panjang : ");
                    param3 = input.nextDouble();
                    PrismaPersegiPanjang prismapersegipanjang = new PrismaPersegiPanjang(param1, param2, param3);
                    prismapersegipanjang.hitungVolume();
                    prismapersegipanjang.hitungLuasPermukaanPrisma();
                    prismapersegipanjang.tampilkanInfo();
                    break;
                case 9 :
                    System.out.print("Masukkan Alas Limas Segitiga : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Alas Limas Segitiga : ");
                    param2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Limas Segitiga : ");
                    param3 = input.nextDouble();
                    LimasSegitiga limassegitiga = new LimasSegitiga(param1, param2, param3);
                    limassegitiga.hitungVolumeLimas();
                    limassegitiga.hitungLuasPermukaanLimas();
                    limassegitiga.tampilkanInfo();
                    break;
                case 10 : 
                    System.out.print("Masukkan Sisi Alas Limas Persegi : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Limas Persegi : ");
                    param2 = input.nextDouble();
                    LimasPersegi limaspersegi = new LimasPersegi(param2, param1);
                    limaspersegi.hitungVolumeLimas();
                    limaspersegi.hitungLuasPermukaan();
                    limaspersegi.tampilkanInfo();
                    break;
                case 11 :
                    System.out.print("Masukkan Panjang Alas Limas Persegi Panjang : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Lebar Alas Limas Persegi Panjang : ");
                    param2 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Limas Persegi Panjang : ");
                    param3 = input.nextDouble();
                    LimasPersegiPanjang limaspersegipanjang = new LimasPersegiPanjang(param2, param1, param3);
                    limaspersegipanjang.hitungVolumeLimas();
                    limaspersegipanjang.hitungLuasPermukaanLimas();
                    limaspersegipanjang.tampilkanInfo();
                    break;
                case 12 :
                    System.out.print("Masukkan Tinggi Pancung Kerucut : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Tinggi Kerucut : ");
                    param2 = input.nextDouble();
                    System.out.print("Masukkan Jari-Jari Kerucut : ");
                    param3 = input.nextDouble();
                    KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(param1, param2, param3);
                    kerucutTerpancung.hitungVolumeKerucutTerpancung();
                    kerucutTerpancung.hitungLuasPermukaanKerucutTerpancung();
                    kerucutTerpancung.tampilkanInfo();
                    break;
                case 13 :
                    System.out.print("Masukkan Jari-Jari Tembereng : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Derajat Tembereng : ");
                    param2 = input.nextDouble();
                    Tembereng tembereng = new Tembereng (param1, param2);
                    tembereng.hitungLuasTembereng();
                    tembereng.hitungKelilingTembereng();
                    tembereng.tampilkanInfo();
                    break;
                case 14 :
                    System.out.print("Masukkan Derajat Juring : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Jari-Jari Lingkaran : ");
                    param2 = input.nextDouble();
                    Juring juring = new Juring(param1, param2);
                    juring.hitungLuasJuring();
                    juring.hitungKelilingJuring();
                    juring.tampilkanInfo();
                    break;
                case 15 :
                    System.out.print("Masukkan Tinggi Cincin : ");
                    param1 = input.nextDouble();
                    System.out.print("Masukkan Lebar Cincin : ");
                    param2 = input.nextDouble();
                    System.out.print("Masukkan Jari-Jari Cincin : ");
                    param3 = input.nextDouble();
                    Cincin cincin = new Cincin(param1, param2, param3);
                    cincin.hitungVolumeCincin();
                    cincin.hitungLuasPermukaanCincin();
                    cincin.tampilkanInfo();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 16);
        } catch (Exception e) {
            System.out.println("Input yang dimasukkan bukan angka.");
        }
    }
}
