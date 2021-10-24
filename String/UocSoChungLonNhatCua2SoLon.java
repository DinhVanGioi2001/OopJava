/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;

import java.util.*;

public class UocSoChungLonNhatCua2SoLon {
    public static int gcd(int n, int m){
        while(m * n != 0){
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return m + n;
    }
    public static int mod(int n, String s){
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result = (result * 10 + s.charAt(i) - '0') % n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int res = mod(n, s);
            System.out.println(gcd(res, n));
        }
    }
}
