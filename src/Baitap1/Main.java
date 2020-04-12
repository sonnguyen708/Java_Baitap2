/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author sonnguyen
 */
public class Main{
    public static void Main(String[] args){
        Nhanvien nv1= new Nhanvien();
        Nhanvien nv2= new Nhanvien();
        nv1.setTen("Nguyen Thanh Phong");
        nv1.setTuoi(20);
        nv1.setDiachi("Nha Trang");
        nv1.setTienluong(2000000);
        nv1.setTongsogiolam(200);
        nv2.setTen("Nguyen Thanh Son");
        nv2.setTuoi(25);
        nv2.setDiachi("Nha Trang");
        nv2.setTienluong(3000000);
        nv2.setTongsogiolam(400);
        System.out.println("nv1.getthongtin()");
        System.out.println("nv2.getThongtin()");
    }
}
