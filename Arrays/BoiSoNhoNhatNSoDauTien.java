package OopJava.Arrays;

import java.util.*;
public class BoiSoNhoNhatNSoDauTien {
    public static long gcd(long a, long b){
        while(a*b != 0){
            if(a > b) a %= b;
            else b %= a;
        }
        return a+b;
    }
    public static long lcm(long a, long b){
        return (a *b)/gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            long res = 1;
            for(int i = 2; i <= n; i++){
                res = lcm(res, i);
            }
            System.out.println(res);
        }
    }
}
