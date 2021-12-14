/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.SapXepLichThi;

import java.util.*;
import java.io.*;
import java.text.ParseException;

/**
 *
 * @author Viet Anh
 */
public class Main {
    static ArrayList<MonHoc> dsmh = new ArrayList<>();
    static ArrayList<CaThi> dsct = new ArrayList<>();
    static ArrayList<LichThi> dslt = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            MonHoc mh = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            dsmh.add(mh);
        }
        sc = new Scanner(new File("CATHI.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            CaThi ct = new CaThi(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            dsct.add(ct);
        }
        sc = new Scanner(new File("LICHTHI.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            // split để tách xâu
            String[] s = sc.nextLine().split(" ");
            // truyền vào s[0], s[1] để 
            LichThi lt = new LichThi(getCaThi(s[0]), getMonHoc(s[1]), s[2], Integer.parseInt(s[3]));
            dslt.add(lt);
        }
        // có thể sử dụng sort theo cách truyền thống mà b Nhung biết là cách implements
        Collections.sort(dslt);
        // hoặc có thể sort theo cách này
        // vì đề bài nói là cấn sort theo thời gian rồi nếu thời gian giống nhau thì sort theo mã thi
        // => nên cần sort theo mã thi trước r đến giờ sau đó đến ngày
//        dslt.sort((i1, i2) -> i1.getMaCaThi().compareTo(i2.getMaCaThi()));
//        dslt.sort((i1, i2) -> Long.compare(i1.getTimeGio(), i2.getTimeGio()));
//        dslt.sort((i1, i2) -> Long.compare(i1.getTimeNgay(), i2.getTimeNgay()));
        for(LichThi i: dslt){
            System.out.println(i);
        }
    }
    
    public static MonHoc getMonHoc(String s){
        for(MonHoc i: dsmh){
            if(i.getMaM().equals(s)){
                return i;
            }
        }
        return null;
    }
    public static CaThi getCaThi(String s){
        for(CaThi i: dsct){
            if(i.getMaCaThi().equals(s)){
                return i;
            }
        }
        return null;
    }
}
