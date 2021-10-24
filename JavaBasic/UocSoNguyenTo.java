package OopJava.JavaBasic;

import java.util.*;

public class UocSoNguyenTo {
    public static long isPrime(long n){
        long max = -1;
        while(n % 2 == 0){
            max = 2;
            n  >>= 1;
        }
        while(n % 3 == 0){
            max = 3;
            n /= 3;
        }
        for(int i = 5; i <= Math.sqrt(n); i += 6){
            while(n % i == 0){
                max = i;
                n /= i;
            }
            while(n % (i + 2) == 0){
                max = i + 2;
                n /= (i + 2);
            }
        }
        if(n > 4){
            max = n;
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long n = sc.nextLong();
            System.out.println(isPrime(n));
        }
    }
}
