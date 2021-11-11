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
public class SinhVien {
    private String maSv, tenSv, lop, email;

    public SinhVien(String maSv, String tenSv, String lop, String email) {
        this.maSv = maSv;
        this.tenSv = chuanHoa(tenSv);
        this.lop = lop;
        this.email = email;
        
    }
    public String chuanHoa(String ten){
        String[] s = ten.toLowerCase().trim().split("\\s+");
        String res = "";
        for(int i = 0; i < s.length; i++){
            res += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
        }
        return res.trim();
    }
    
    public String getMaSv() {
        return maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }
    
}
