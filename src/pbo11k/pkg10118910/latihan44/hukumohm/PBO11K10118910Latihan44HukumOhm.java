/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan44.hukumohm;

/**
 *
 * @author ACER
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 * Deskripsi Program : Program ini berisi program untuk menghitung hukum ohm
 */
public class PBO11K10118910Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai btr = new Baterai();
        System.out.println("====== Hukum Ohm ======");
        System.out.println("Kuat arus yang mengalir pada suatu kawat Penghantar\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
        Baterai btr1 = new Baterai(btr.getKuatArus(),btr.getHambatan());
    }
    
}
