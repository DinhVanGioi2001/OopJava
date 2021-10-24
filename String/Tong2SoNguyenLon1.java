// cach 1: duyet trau


//package OopJava.String;
//
//import java.util.*;
//
//public class Tong2SoNguyenLon1 {
//    
//    public static String daoXau(String s){
//        int n = s.length();
//        String res = "";
//        for(int i = 0; i < n; i++){
//            res += s.charAt(n - i - 1);
//        }
//        return res;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        while(test-- > 0){
//            String x = sc.next();
//            String y = sc.next();
//            int len1 = x.length(), len2 = y.length();
//            int max = (len1 > len2)? len1 : len2;
//            x = daoXau(x);
//            y = daoXau(y);
//            if(max > len1){
//                for(int i = max; i > len1; i--){
//                    x += '0';
//                }
//            }
//            if(max > len2){
//                for(int i = max; i > len2; i--){
//                    y += '0';
//                }
//            }
//            int soDu = 0;
//            String s = "";
//            for(int i = 0;i < max; i++){
//                int tong = 0;
//                tong = x.charAt(i) - '0' + y.charAt(i) - '0' + soDu;
//                s = tong % 10 + s;
//                soDu = tong/10;
//            }
//            if(soDu == 1){
//                s = 1 + s;
//            }
//            System.out.println(s);
//        }
//    }
//}
 
// cach 2: su dung BigInteger
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;

import java.util.*;
import java.math.BigInteger;

public class Tong2SoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger res = a.add(b);
            System.out.print(res);
        }
    }
}
