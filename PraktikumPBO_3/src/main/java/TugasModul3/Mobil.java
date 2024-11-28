/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    
    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
    return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }    
    void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
    void displayInfo() {
        System.out.println("Merk: " + getMerk() + " Model: " + getModel() + " Tahun: " + getTahun());
    }
}
