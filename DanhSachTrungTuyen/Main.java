/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.DanhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TrungTuyen> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            TrungTuyen ts = new TrungTuyen(sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()));
            ds.add(ts);
        }
        Collections.sort(ds);
        int n2 = Integer.parseInt(sc.nextLine());
        solution(n2, ds);
    }

    public static void solution(int n, ArrayList<TrungTuyen> ds) {
        System.out.printf("%.1f\n", ds.get(n - 1).sumAll());
        for (TrungTuyen j : ds) {
            j.show(ds.get(n - 1).sumAll());
        }
    }
}
