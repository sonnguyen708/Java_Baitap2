/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

/**
 *
 * @author sonnguyen
 */
public abstract class chuyenxe {
    public int maso;
    public String tentaixe;
    public String soxe;
    public double doanhthu;

    public chuyenxe(int maso, String tentaixe, String soxe, double doanhthu) {
        this.maso = maso;
        this.tentaixe = tentaixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }
    public void xuatthongtin(){
        System.out.println("Thong tin chuyen xe");
        System.out.println("Ma so chuyen"+this.maso);
        System.out.println("Ten tai xe:"+this.tentaixe);
        System.out.println("So xe"+this.soxe);
        System.out.println("Doanh thu:"+this.doanhthu+"\n");
    };
}
