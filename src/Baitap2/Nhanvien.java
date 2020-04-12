/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

/**
 *
 * @author sonnguyen
 */
public class Nhanvien {
     // attributes
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongsogiolam;
    //constructor
    public Nhanvien() {
        this.ten="";
        this.tuoi=0;
        this.diachi="";
        this.tienluong=0;
        this.tongsogiolam=0;
    }
    //getter and setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    } 
    public void setten(String ten){this.ten=ten;}
    public String getten() { return this.ten; }
    public void settuoi(int tuoi) { this.tuoi = tuoi; }
    public int gettuoi() { return this.tuoi; }
    public void setDiaChi(String diachi) { this.diachi = diachi; }
    public String getDiaChi() { return this.diachi; }
    public void settienluong(double tienluong) { this.tienluong = tienluong; }
    public double gettienluong() { return this.tienluong; }
    public void settonggiolam(int tongsogiolam) { this.tongsogiolam = tongsogiolam; }
    public int gettongsogiolam() { return this.tongsogiolam; }
    public double getThuong() {
    // tinh luong nhan vien
        if (tongsogiolam >= 200) 
            return tienluong * 0.2;
        else 
            if (tongsogiolam >= 100) return tienluong * 0.1;
        else return 0;
    }
    //Lay thong tin nhan vien
   public String getThongTin() {
        return "Ten: " + this.ten +
                ", Tuoi: " + this.tuoi +
                ", Dia chi: " + this.diachi +
                ", Tien luong: " + this.tienluong +
                ", Tong so gio lam: " + this.tongsogiolam +
                ", Tien thuong: " + this.getThuong() + ".";
    }
}
