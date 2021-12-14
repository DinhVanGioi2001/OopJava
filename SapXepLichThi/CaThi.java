/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.SapXepLichThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Viet Anh
 */
public class CaThi{
    private String maCaThi;
    private Date ngayThi, gioThi;
    private int phongThi;
    
    // để String ngayThi vì bên hàm main truyền vào 1 String
    
    public CaThi(int maCaThi, String ngayThi, String gioThi, int phongThi) throws ParseException {
        this.maCaThi = "C" + String.format("%03d", maCaThi);
        // sử dụng SimpleDateFormat để dành cho mục đích định dạng ngày tháng
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // sử dụng parse để đưa từ định dạng string về date
        this.ngayThi = sdf.parse(ngayThi);
        // tương đương như trên
        sdf = new SimpleDateFormat("HH:mm");
        this.gioThi = sdf.parse(gioThi);
        this.phongThi = phongThi;
    }
    
    

//    public String getMaCaThi() {
//        return maCaThi;
//    }
//    
//    public long getTimeNgay(){
//        return ngayThi.getTime() / 1000;
//    }
//    
//    public long getTimeGio(){
//        return gioThi.getTime()/1000;
//    }

//    @Override
//    public int compareTo(CaThi o) {
//        if(this.getTimeNgay() > o.getTimeNgay()) return 1;
//        if(this.getTimeNgay() < o.getTimeNgay()) return -1;
//        if(this.getTimeGio() > o.getTimeGio()) return 1;
//        if(this.getTimeGio() < o.getTimeGio()) return -1;
//        return this.maCaThi.compareTo(o.maCaThi);
//    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public Date getGioThi() {
        return gioThi;
    }

    public int getPhongThi() {
        return phongThi;
    }
    
}
