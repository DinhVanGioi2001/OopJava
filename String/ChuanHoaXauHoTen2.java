package OopJava.String;

import java.util.*;

public class ChuanHoaXauHoTen2{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int test = Integer.parseInt(sc.nextLine());
//        while(test-- >0){
//            String s = sc.nextLine();
//            String stmp = "";
//            int n = s.length(), check = 0;
//            for(int i = 0; i < n; i++){
//                if(s.charAt(i) != ' '){
//                    stmp += s.charAt(i);
//                    check = 1;
//                }else if(check == 1){
//                    stmp += " ";
//                    check = 0;
//                }
//            }
//            stmp = stmp.toLowerCase();
//            String res1 = "";
//            n = stmp.length();
//            int j = 0;
//            for(int i = 0; i < n; i++){
//                if(stmp.charAt(i) != ' '){
//                    res1 += stmp.charAt(i);
//                }else{
//                    j = i + 1;
//                    break;
//                }
//            }
//            res1 = res1.toUpperCase();
//            s = "";
//            for(int i = j; i < n; i++){
//                if(i == j){
//                    char c = Character.toUpperCase(stmp.charAt(i));
//                    s += c;
//                }else if(stmp.charAt(i - 1) == ' '){
//                    char c = Character.toUpperCase(stmp.charAt(i));
//                    s += c;
//                }else{
//                    s += stmp.charAt(i);
//                }
//            }
//            System.out.print(s + ", " + res1);
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            //chuyen ve chu thuong va xoa khoang trang o 2 dau
            String s = sc.nextLine().toLowerCase().trim();
            // tao xau mac dinh
            String res = "";
            // tach cac xau ra khoi khoang trang
            String[] tmp = s.split("\\s+");
            // i chay tu 1 vi tmp[0] cho xuong cuoi xau
            for(int i = 1; i < tmp.length; i++){
                // neu ma i la phan tu cuoi thi khong cong them " "
                if(i == tmp.length - 1){
                    // substring(0, 1) lay phan tu dau tien cua phan tu
                    res += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1);
                }else{
                    res += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
                }
            }
            // cong them dau phay và tmp[0] in hoa
            res += ", " +  tmp[0].toUpperCase();
            System.out.println(res);
        }
    }
}