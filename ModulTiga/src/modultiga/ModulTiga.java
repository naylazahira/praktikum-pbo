/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modultiga;

import Perusahaan.Manager;
import Perusahaan.Karyawan;

/**
 *
 * @author ASUS
 */
public class ModulTiga { //inheretance

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Manager nayla = new Manager();
        nayla.setGaji(10000);
        nayla.nama = "nayla";
        nayla.tampilGaji();
        
        nayla.bekerja();
        nayla.menyuruh();
        nayla.jingle();
        nayla.printTotalGaji();
        nayla.printTotalGaji(5000);
        
        Karyawan edo = new Karyawan(); //instansiasi
        edo.setGaji(10);
        edo.nama = "edo edo";
        
        ModulTiga.meeting(edo, nayla);
    }
    

    
    public static void meeting(Karyawan karyawanOne, Karyawan karyawan){
        karyawanOne.jingle();
        karyawan.jingle();
    }
}
