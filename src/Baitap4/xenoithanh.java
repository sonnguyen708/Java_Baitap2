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
public class xenoithanh extends chuyenxe {
   public String sotuyen;
   public int km;
   public xenoithanh(int maso, String tentaixe,String soxe, double doanhthu,String sotuyen, int km) {
        super(maso,tentaixe,soxe,doanhthu);
        this.sotuyen = sotuyen;
        this.km = km;
    }
    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("So tuyen:"+this.sotuyen);
        System.out.println("so km:"+this.km+"\n");
    }  
}
