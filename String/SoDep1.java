/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;

import java.util.*;

public class SoDep1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        while(test-- > 0){
//            String s = sc.next();
//            int check = 1, tmp, n = s.length();
//            for(int i = 0; i < s.length()/2; i++){
//                tmp = s.charAt(i) - '0';
//                if(tmp % 2 != 0){
//                    check = 0;
//                    break;
//                }else if(s.charAt(n - i - 1) != s.charAt(i)){
//                    check = 0;
//                    break;
//                }
//            }
//            if(check == 1){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
//        }
//    }
    static int snt(String s){
        int n=s.length();
        for(int i=0;i<(n/2);i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return 0;
            }
        }return 1;
    }
    static int kiemtra(String s){
       int   n=s.length();
        for(int i=0;i<n;i++){
            if(((int)s.charAt(i)-'0')%2!=0){
                return 0;
            }
        }return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(snt(s)==1&&kiemtra(s)==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
