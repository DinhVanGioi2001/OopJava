/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Viet Anh
 */
public class KhachHang implements Comparable<KhachHang> {
    private String maKh, tenKh;
    private Date ngayNhan, ngayTra;
    private int phatSinh, soPhong;

    public KhachHang(int i, String ten, int soPhong, String ngayNhan, String ngayTra, int phatSinh) throws ParseException {
        this.maKh = "KH" + String.format("%02d", i);
        this.tenKh = getTen(ten);
        this.soPhong = soPhong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhan = sdf.parse(ngayNhan);
        this.ngayTra = sdf.parse(ngayTra);
        this.phatSinh = phatSinh;
    }
    
    public String getTen(String ten){
        String[] s = ten.toLowerCase().trim().split("\\s+");
        String res = "";
        for(int i = 0; i < s.length; i++){
            res += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
        }
        return res.trim();
    }
    
    public int getNgayO(){
        long time = (ngayTra.getTime() - ngayNhan.getTime())/1000;
        if(time <= 24 * 3600){
            return 1;
        }
        return (int)time/(24 * 3600) + 1;
    }
    
    public int getTongTien(){
        String tmp = String.valueOf(soPhong);
        tmp = tmp.substring(0, 1);
        if(tmp.equals("1")){
            return getNgayO() * 25 + phatSinh;
        }else if(tmp.equals("2")){
            return getNgayO() * 34 + phatSinh;
        }else if(tmp.equals("3")){
            return getNgayO() * 50 + phatSinh;
        }
        return getNgayO() * 80 + phatSinh;
    }
    
    @Override
    public String toString() {
        return maKh + " " + tenKh + " " + soPhong + " " + getNgayO() + " " + getTongTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.getTongTien() > o.getTongTien()) return -1;
        if(this.getTongTien() < o.getTongTien()) return 1;
        return 0;
    }
    
}
