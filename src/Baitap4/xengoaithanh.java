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
public class xengoaithanh extends chuyenxe {
    public String noiden;
    public int songaydi;

    public xengoaithanh(int maso, String tentaixe, String soxe, double doanhthu,String noiden, int songaydi) {
        super(maso,tentaixe,soxe,doanhthu);
        this.noiden = noiden;
        this.songaydi = songaydi;
    }
    @Override
    public void xuatthongtin() {
        super.xuatthongtin();
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("Noi den:"+this.noiden);
        System.out.println("So ngay di:"+this.songaydi+"\n");
    }
    
}
