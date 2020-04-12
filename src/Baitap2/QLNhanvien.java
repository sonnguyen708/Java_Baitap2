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
import java.util.ArrayList;
import Baitap2.Nhanvien;
public class QLNhanvien implements IQLNV {
    // danh sach nhan vien 
    ArrayList<Nhanvien> dsNhanvien= new ArrayList();
    // implements methods

    @Override
    public void them(Nhanvien nv) {
        dsNhanvien.add(nv);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        dsNhanvien.forEach(nv->System.out.println(nv.getThongTin()));
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
