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
import java.util.ArrayList;
public class QLchuyen {
    //atributes
    public ArrayList<chuyenxe> dschuyen= new ArrayList<>();
    //methods
    //them chuyen xe
    public void themchuyenxe(chuyenxe xe){
        dschuyen.add(xe);
    }
    //xuat danh sach chuyen xe
    public ArrayList<chuyenxe> xuatdschuyenxe(){
        return dschuyen;
    }
    //in thong tin
    public void inDanhsach(){
        dschuyen.forEach(xe->xe.xuatthongtin());
    }
    //tong doanh thu ngoai thanh
    public double doanhthuxengoaithanh(){
           double doanhthu =0;
        for(chuyenxe xe : dschuyen){
            if( xe instanceof xengoaithanh){
              doanhthu=((xengoaithanh) xe).doanhthu+doanhthu;
            }
        }
         return doanhthu;
    } 
    //tong doanh thu xe noi thanh
    public double doanhthuxenoithanh(){
        double doanhthu =0;
        for(chuyenxe xe : dschuyen){
            if( xe instanceof xenoithanh){
                doanhthu=((xenoithanh)xe).doanhthu+doanhthu;
            }
        }
         return doanhthu;
    } 
    //tinh tong doanh thu
    public double tongDoanhThu() {
      double doanhthu = 0;
      for (chuyenxe xe : dschuyen) {
        doanhthu += xe.doanhthu;
      }
      return doanhthu;
    }
}
