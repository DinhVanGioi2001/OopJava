package OopJava.JavaBasic;

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int m = (int) Math.sqrt(n);
            if(m * m == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
