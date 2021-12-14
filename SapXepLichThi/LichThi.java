/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.SapXepLichThi;

import java.text.SimpleDateFormat;

/**
 *
 * @author Viet Anh
 */
public class LichThi implements Comparable<LichThi>{
    private MonHoc monHoc;
    private CaThi caThi;
    private String maNhom;
    private int soSv;

    public LichThi(CaThi caThi, MonHoc monHoc, String maNhom, int soSv) {
        this.monHoc = monHoc;
        this.caThi = caThi;
        this.maNhom = maNhom;
        this.soSv = soSv;
    }
    // lấy mã ca thi để phục vụ cho sort bên main
    public String getMaCaThi() {
        return caThi.getMaCaThi();
    }
    // timengay cũng phục vụ sort bên main
    public long getTimeNgay(){
        return caThi.getNgayThi().getTime() / 1000;
    }
    // timeGio cũng thế
    public long getTimeGio(){
        return caThi.getGioThi().getTime()/1000;
    }

    @Override
    public String toString() {
        // bởi vì bên caThi đang để là Date nên cần dùng SimpleDateFormat.format để đưa về string để in ra
        // nếu không thì nó sẽ in ra sai định dạng
        // nhớ để HH vì là 24h, hh chỉ là định dạng 12h
        return new SimpleDateFormat("dd/MM/yyyy").format(caThi.getNgayThi()) + " " +
                new SimpleDateFormat("HH:mm").format(caThi.getGioThi())
                + " " + caThi.getPhongThi() + " " +
                monHoc.getTenM() + " " + maNhom + " " + soSv;
    }

    @Override
    public int compareTo(LichThi o) {
        if(this.getTimeNgay() > o.getTimeNgay()) return 1;
        if(this.getTimeNgay() < o.getTimeNgay()) return -1;
        if(this.getTimeGio() > o.getTimeGio()) return 1;
        if(this.getTimeGio() < o.getTimeGio()) return -1;
        return this.getMaCaThi().compareTo(o.getMaCaThi());
    }
    
}
