package OopJava.Arrays;

import java.util.*;

public class DemLanXuatHien {
    public static void display(int a[], int n){
        // khai bao mang check
        boolean[] check = new boolean[100000];
        // dat tat ca gia tri trong mang bang false
        Arrays.fill(check, false);
        for(int i = 0; i < n; i++){
                int dem = 1;
                // neu phan tu i da xet thi bo qua
                if(check[i] == true){
                    continue;
                }else{ // nguoc lai dem so lan xuat hien cua phan tu i
                    for(int j = i + 1; j < n; j++){
                        if(a[i] == a[j]){
                            dem++;
                            check[j] = true;
                        }
                    }
                }
                // in ra so lan xuat hien
                System.out.println(a[i] + " xuat hien " + dem + " lan");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap bo test
        int test = sc.nextInt();
        int count = 1;
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            // nhap mang
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            // in ra bo test
            System.out.println("Test " + count++ + ":");
            display(a, n);
        }
    }
}