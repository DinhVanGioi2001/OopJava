package OopJava.String;

import java.util.*;
/*
https://www.geeksforgeeks.org/find-value-1n-2n-3n-4n-mod-5/
*/
/*
(1^n + 2^n + 3^n + 4^n) % 5
n = 1: f(n) = 10
n = 2: f(n) = 30
n = 3: f(n) = 100
n = 4: f(n) = 354
n = 5: f(n) = 1300
=>> chu ki la 4 va chi can xet xem so nay co chia het cho 4 hay khong
=>> neu chia het cho 4 thi % 5 sẽ la 4 con khong thi la 0
*/
public class TimSoDu {
    public static int solution(String s){
        // kiem tra neu nho hon 9 thi tra lai ket qua chia du cho 4
        if(s.length() == 1){
            return ((s.charAt(0) - '0') % 4); 
        }
        // % 4 == 0 => thi chi can 2 so cuoi chia het cho 4
        int res = 0, j = 1;
        for(int i = 0; i < 2; i++){
            res = res + (s.charAt(s.length() - i - 1) - '0' ) * j;
            j *= 10;
        }
        return res % 4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            int res = solution(s);
            // neu res = 0 nghia la n % 4 == 0 và f(n) % 5 == 4
            if(res == 0){
                System.out.println("4");
            }else{// nguoc lai thi f(n) % 5 == 0
                System.out.println("0");
            }
        }
    }
}
