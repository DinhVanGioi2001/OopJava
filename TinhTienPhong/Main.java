package OopJava.TinhTienPhong;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> dskh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<= n; i++){
            KhachHang kh = new KhachHang(i, sc.nextLine(), Integer.parseInt(sc.nextLine().trim()),
                    sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            dskh.add(kh);
        }
        Collections.sort(dskh);
        for(KhachHang i: dskh){
            System.out.println(i);
        }
    }
}
