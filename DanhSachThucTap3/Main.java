/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.DanhSachThucTap3;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;


public class Main {
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<DoanhNghiep> dsdn = new ArrayList<>();
    static ArrayList<ThucTap> dstt = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassCastException{
        //Nhap vao sinh vien
        Scanner sc = new Scanner(new File("SINHVIEN.IN"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            dssv.add(sv);
        }
        // nhap vao doanh nghiep
        sc = new Scanner(new File("DN.IN"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()));
            dsdn.add(dn);
        }
        // nhap vao thuc tap
        sc = new Scanner(new File("THUCTAP.IN"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] s= sc.nextLine().split(" ");
            ThucTap tt = new ThucTap(timSv(s[0]), timDn(s[1]));
            dstt.add(tt);
        }
        dstt.sort((i1, i2) -> i1.getMaSv().compareTo(i2.getMaSv()));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            int m = 0;
            for(ThucTap j: dstt){
                if(j.getMaDn().equals(s)){
                    System.out.println("DANH SACH THUC TAP TAI " + j.getTenDn() + ":");
                    m = j.getSlNhan();
                    break;
                }
            }
            for(ThucTap j: dstt){
                if(j.getMaDn().equals(s) && m > 0){
                    System.out.println(j);
                    m--;
                }
            }
        }
    }
    
    public static SinhVien timSv(String msv){
        for(SinhVien i: dssv){
            if(i.getMaSv().equals(msv)){
                return i;
            }
        }
        return null;
    }
    
    public static DoanhNghiep timDn(String mdn){
        for(DoanhNghiep i: dsdn){
            if(i.getMaDn().equals(mdn)){
                return i;
            }
        }
        return null;
    }
}
