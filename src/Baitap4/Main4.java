/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

/**
 *
 * @author Admin
 */
public class Main4 {
    public static void main(String[] args){
        //ql chuyen xe
       QLchuyen qlcx= new QLchuyen();
       //create chuyen xe noi thanh 
       chuyenxe xenoithanh1= new xenoithanh(1,"Nguyen van tung","79A-143",12000,"Nha Trang",35);
       chuyenxe xenoithanh2= new xenoithanh(2,"Nguyen van son","76A-143",12500,"CAM RANH",55);
       chuyenxe xenoithanh3= new xenoithanh(3,"Nguyen van tien","75A-143",13000,"Nha Trang",45);
       //them chuyen xe
       qlcx.themchuyenxe(xenoithanh1);
       qlcx.themchuyenxe(xenoithanh2);
       qlcx.themchuyenxe(xenoithanh3);
       //create chuyen xe ngoai thanh 
       chuyenxe xengoaithanh4= new xengoaithanh(4,"Nguyen van thanh","35A-143",12600,"Nha Trang",35);
       chuyenxe xengoaithanh5= new xengoaithanh(5,"Nguyen sy tinh","111A-143",12600,"Nha Trang",60);
       chuyenxe xengoaithanh6= new xengoaithanh(6,"Nguyen van thao","32A-143",13300,"Nha Trang",38);
       //them chuyen xe
       qlcx.themchuyenxe(xengoaithanh4);
       qlcx.themchuyenxe(xengoaithanh5);
       qlcx.themchuyenxe(xengoaithanh6);
       //in thong tin 
       qlcx.xuatdschuyenxe();
       //Tong doanh thu cac chuyen
       System.out.println("Tong doanh thu xe noi thanh:"+"\n");
       System.out.println("Tong doanh thu xe ngoai thanh:"+"\n");
       System.out.println("Tong doanh thu :"+"\n");
   }
    
     
}
