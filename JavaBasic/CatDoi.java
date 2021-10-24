package OopJava.JavaBasic;

import java.util.*;

public class CatDoi {
    public static int check(long n){
        if(n == 0 || n == 8 || n == 9) return 0;
        else if(n == 1) return 1;
        else return -1;
    }
    public static long catDoi(long n){
        long sum = 0, i  = 1;
        long tmp;
        while(n > 0){
            tmp = n %10;
            n /= 10;
            tmp = check(tmp);
            if(tmp != -1){
                sum = sum + tmp * i;
                i *= 10;
            }else return -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long n  = sc.nextLong();
            long res = catDoi(n);
            if(res == -1 || res == 0){
                System.out.println("INVALID");
            }else{
                System.out.println(res);
            }
        }
    }
}
