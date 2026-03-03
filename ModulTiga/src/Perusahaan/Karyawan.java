/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perusahaan;

/**
 *
 * @author ASUS
 */
public class Karyawan {
    public double gaji;
    public String nama;
    
    //setter
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    //getter
    public double getGaji(){
        return this.gaji;
    }
    
    public void printTotalGaji (double tambahan){
        System.out.println("Total gajiku + tambahan: " + (this.gaji + tambahan));
    }
    
    public void printTotalGaji (){
        System.out.println("Total gajiku: " + this.gaji);
    }
    
    public void jingle(){    // ini kayanya polymorphism
        System.out.println("aku karyawan yg keren");
    }
    
    public void bekerja(){
        System.out.println(this.nama + " sedang bekerja ");
    }
    
    public void tampilGaji(){
        System.out.println("Gaji " + this.nama + ": " +this.gaji);
    }

}
