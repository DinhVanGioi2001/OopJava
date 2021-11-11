/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.DanhSachThucTap3;

/**
 *
 * @author Viet Anh
 */
public class ThucTap {
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }
    
    public String getMaSv(){
        return sv.getMaSv();
    }
    public String getTenDn(){
        return dn.getTenDn();
    }
    
    public String getMaDn(){
        return dn.getMaDn();
    }
    
    public int getSlNhan(){
        return dn.getSlNhan();
    }
    @Override
    public String toString() {
        return sv.getMaSv()  + " " + sv.getTenSv() + " " + sv.getLop();
    }
}
