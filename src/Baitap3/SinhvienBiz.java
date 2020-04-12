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
public class SinhvienBiz extends SinhVienPoLy {
    //atributes
    public double diemmaketing;
    public double diemsales;
    //constructor
    public SinhvienBiz(String hoten,String nganh,double diemmaketing,double diemsales){
        super(hoten,nganh);
        this.diemmaketing=diemmaketing;
        this.diemsales=diemsales;       
    }
    //defined
    @Override
    public double getdiem() {
        System.out.println((2*this.diemmaketing+this.diemsales)/3);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;   
    };
}
