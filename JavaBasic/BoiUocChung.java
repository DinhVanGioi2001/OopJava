package OopJava.JavaBasic;

import java.util.*;
public class BoiUocChung {
    static long uocSo(long n1, long n2){
        while(n1 != n2){
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        return n1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long n1 = sc.nextInt();
            long n2 = sc.nextInt();
            long lcm = uocSo(n1, n2);
            long gcd = (n1*n2)/lcm;
            System.out.println(gcd + " " + lcm);
//            System.out.println();
        }
    }
}
