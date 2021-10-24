package OopJava.String;

import java.util.*;

public class XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = "";
        // tu dong nhap
        while(sc.hasNextLine()){
            tmp += sc.nextLine();
        }
        // chuyen doi nhieu dau cach thanh 1 dau cach
        tmp = tmp.replaceAll("\\s+", " ");
        // phan tach cac cau tu cac ki tu . ? ! thanh cau rieng biet
        String[] res = tmp.split("[.?!]");
        for(String a : res){
            // xoa khoang trong dau cuoi va chuyen ve chu thuong
            a = a.trim().toLowerCase();
            a = a.substring(0, 1).toUpperCase() + a.substring(1);
            System.out.println(a);
        }
    }
}
