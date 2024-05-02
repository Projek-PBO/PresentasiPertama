/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgeometri;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuBuilder {
    int pilihan;
    public void membuatMenuUtama(){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Project Geometri");
        System.out.println("Silahkan Pilih Sub Menu : ");
        System.out.println("1. Geometri 2 Dimensi");
        System.out.println("2. Geometri 3 Dimensi");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        if(pilihan == 1){
            Menu2D menu2d = new Menu2D();
            menu2d.membuatMenu2D();
        } else {
            Menu3D menu3d = new Menu3D();
            menu3d.membuatMenu3d();
        }
    }
}
