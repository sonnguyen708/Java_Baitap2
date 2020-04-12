/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

/**
 *
 * @author Admin
 */
import Baitap2.Nhanvien;
public class Main2 {
    public static void main(String[] args){
        // create quan ly nhan vien 
        IQLNV qlnv= new QLNhanvien();
        
        // create nhan vien thu 1
        Nhanvien nv1= new Nhanvien();
        nv1.setTen("Nguyen Thanh Phong");
        nv1.setTuoi(20);
        nv1.setDiachi("Nha Trang");
        nv1.setTienluong(2000000);
        nv1.setTongsogiolam(200);
        //create nhan vien thu 2
        Nhanvien nv2= new Nhanvien();
        nv2.setTen("Nguyen Thanh Son");
        nv2.setTuoi(25);
        nv2.setDiachi("Nha Trang");
        nv2.setTienluong(3000000);
        nv2.setTongsogiolam(400);
        //create nhan vien thu 3
        Nhanvien nv3= new Nhanvien();
        nv3.setTen("Nguyen Thanh Tung");
        nv3.setTuoi(26);
        nv3.setDiachi("Nha Trang");
        nv3.setTienluong(3500000);
        nv3.setTongsogiolam(210);
        //create nhan vien thu 4
        Nhanvien nv4= new Nhanvien();
        nv4.setTen("Nguyen Huu Thang");
        nv4.setTuoi(25);
        nv4.setDiachi("Nha Trang");
        nv4.setTienluong(4000000);
        nv4.setTongsogiolam(600);
        //create nhan vien thu 5
        Nhanvien nv5= new Nhanvien();
        nv5.setTen("Nguyen Minh Son");
        nv5.setTuoi(25);
        nv5.setDiachi("Nha Trang");
        nv5.setTienluong(5000000);
        nv5.setTongsogiolam(500);
        // ad nhan vien list vao quan ly nhan vien
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        // qlnv inDS
        qlnv.inDS();
    }     
}
