/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri;

import java.util.Scanner;
import projectgeometri.Geometri3D.Balok;
import projectgeometri.Geometri3D.Bola;
import projectgeometri.Geometri3D.Kubus;
import projectgeometri.Geometri3D.Tabung;

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
                System.out.print("");
        }
    }
    
}
