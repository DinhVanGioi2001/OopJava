/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;

import java.util.*;

public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =  Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s = sc.nextLine();
            int n = s.length();
            boolean ok = false;
            String stmp = "";
            // xoa khoang trang trong xau
            for(int i = 0;i < n; i++){
                if(s.charAt(i) != ' '){
                    stmp = stmp + s.charAt(i);
                    ok = true;
                }else if(ok == true){
                    stmp = stmp + " ";
                    ok = false;
                }
            }
            s = stmp.toLowerCase();
            n = s.length();
            stmp = "";
            for(int i = 0; i < n; i++){
                if(i == 0){
                    char c = Character.toUpperCase(s.charAt(i));
                    stmp = stmp + c;
                }else if(s.charAt(i - 1) == ' '){
                    char c = Character.toUpperCase(s.charAt(i));
                    stmp += c;
                }else{
                    stmp = stmp + s.charAt(i);
                }
            }
            System.out.println(stmp);
        }
    }
}
