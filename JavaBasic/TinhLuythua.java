package OopJava.JavaBasic;

import java.util.Scanner;

public class TinhLuythua {
    public static long p = 1000000007;
    public static long mul(long a, long b){
        if(b == 0) return 0;
        long tmp = mul(a, b/2);
        if(b % 2 == 1) return (tmp*2 + a) % p;
        return tmp*2%p;
    }
    public static long luyThua(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long tmp = luyThua(a, b/2);
        long n = mul(tmp, tmp);
        if(b % 2 == 1) return (n*a)%p;
        return n % p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        while(a != 0 || b != 0){
            long res = luyThua(a, b);
            System.out.println(res);
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0) break;
        }
    }
}
