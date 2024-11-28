/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020);
        mobil1.displayInfo();
        mobil1.startEngine();
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022);
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}
