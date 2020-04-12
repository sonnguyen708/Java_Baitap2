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
public class SinhvienIT extends SinhVienPoLy{
    //atributes
    public double diemjava;
    public double diemcss;
    public double diemhtml;
    //constructor
    public SinhvienIT(String hoten,String nganh,double diemjava,double diemcss,double diemhtml){
        super(hoten,nganh);
        this.diemjava=diemjava;
        this.diemcss=diemcss;
        this.diemhtml=diemhtml;
    }
    @Override
    public double getdiem() {
        return ((2*this.diemjava+this.diemhtml+this.diemcss)/4);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    };      
}
