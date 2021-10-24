package OopJava.JavaBasic;

import java.util.Scanner;
import java.lang.Math;

public class UocSoChiaHetCho2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long n = sc.nextLong();
            if(n % 2 == 1)
                System.out.println(0);
            else{
                int count = 0, i;
                for(i = 1; i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        if(i % 2 == 0){ // n % i & i % 2 == 0 thi tang
                            count++;
                        }
                        // xet xem n/i co chia het hay khong
                        if((n/i) % 2 == 0){
                            count++;
                        }
                    }
                }
                // kt xem co bi trung phan tu
                // vd: sqrt(100) thi i luc nay se la 11 - 1 = 10
                // vi 10 va 100/10 duoc count++ 2 lan nen can giam bot 1 lan
                i--;
                if((i*i == n) && (i % 2 == 0)){
                    count--;
                }
                System.out.println(count);
            }
        }
    }
}
