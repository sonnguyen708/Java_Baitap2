/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap3;

/**
 *
 * @author Admin
 */
public class Main3 {
    public static void main(String [] args){
        //create SinhvienIT
        SinhvienIT it = new SinhvienIT("Nguyen Thanh Tung","CNTT",9,8,10);
        //create SinhvenBIZ
        SinhvienBiz biz = new SinhvienBiz("Nguyen Truong Long","BIZ",9,5);
        //create SinhVienPoLy tu sinh vien IT
        SinhVienPoLy poly= new SinhvienIT("Nguyen Thanh Nam","CK",8,7,6);
    //xuat thong tin sinh vien 
    it.xuat();
    System.out.println("diem:"+it.getdiem());
    System.out.println("hocluc:"+it.gethocluc());
    biz.xuat();
    System.out.println("diem:"+biz.getdiem());
    System.out.println("hocluc:"+biz.gethocluc());
    poly.xuat();
    System.out.println("diem:"+poly.getdiem());
    System.out.println("hocluc:"+poly.gethocluc());
    }
}
    
