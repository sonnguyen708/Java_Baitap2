/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap3;

/**
 *
 * @author sonnguyen
 */
public abstract class SinhVienPoLy {
    //atributes
    public String hoten;
    public String nganh;

    public SinhVienPoLy(String hoten,String nganh) {
        this.hoten=hoten;
        this.nganh=nganh;
    }
    //methods
    //reveiw hoc luc
    public abstract double getdiem();
    public String gethocluc()
    {
        if(this.getdiem()<5)
        {
            return "yeu";
        }
        if(this.getdiem()<6.5)
        {
            return "Trung binh";
        }
        if(this.getdiem()<7.5)
        {
            return "Kha";
        }
        if(this.getdiem()<9)
        {
            return "Gioi";
        }
                
        return "Xuat sac";
    }
    public  void xuat()
    {
        System.out.println("Hoten:"+this.hoten+"Nganh:"+this.nganh);
    }
}
   
