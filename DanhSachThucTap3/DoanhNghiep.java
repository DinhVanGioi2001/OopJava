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
public class DoanhNghiep {
    private String maDn, tenDn;
    private int slNhan;

    public DoanhNghiep(String maDn, String tenDn, int slNhan) {
        this.maDn = maDn;
        this.tenDn = tenDn;
        this.slNhan = slNhan;
    }

    public String getMaDn() {
        return maDn;
    }

    public String getTenDn() {
        return tenDn;
    }

    public int getSlNhan() {
        return slNhan;
    }
    
}
