//Created by 21343053_KhalilulAfwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author KHALILUL
 */
public class Employ extends Person {
    private String noKaryawan;
    
    //Konstruktor
    public Employ (String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    //Metode
    public void info() {
        System.out.println("No. karyawan : " + this.noKaryawan);
        super.info();
    }
}
