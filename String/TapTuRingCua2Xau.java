package OopJava.String;

import java.util.*;


public class TapTuRingCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            //nhap va luu vao thanh cac mang
            String s = sc.nextLine();
            String tmp1[] = s.split(" ");
            s = sc.nextLine();
            String tmp2[] = s.split(" ");
            // su dung set vi khong chua cac phan tu trung nhau
            HashSet<String> hs1 = new HashSet<String>();            
            HashSet<String> hs2 = new HashSet<String>();
            // tao mang chua phan tu trong xau 1 khong trung nhau
            String[] res = new String[200];
            int count = 0;
            // sap xep lai mang theo thu tu tu dien
            Arrays.sort(tmp1);
            // kiem tra neu trung nhau thi khong them con khong thi them vao xau
            // them vao res de in ra man hinh
            for(int i = 0; i < tmp1.length; i++){
                if(hs1.contains(tmp1[i])){
                    continue;
                }else{
                    hs1.add(tmp1[i]);
                    res[count] = tmp1[i];
                    count++;
                }
            }
            // dua vao hashSet mang xau thu 2
            for(int i =0; i < tmp2.length; i++){
                if(hs2.contains(tmp2[i])){
                    continue;
                }else{
                    hs2.add(tmp2[i]);
                }
            }
            // kiem tra xem co trung voi phan tu ben trong mang res khong
            // neu trung thi bo qua nguoc lai in ra man hinh
            for(int i = 0; i < count; i++){
                if(hs2.contains(res[i])){
                    continue;
                }else{
                    System.out.print(res[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
