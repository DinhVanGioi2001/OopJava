package OopJava.String;

import java.util.*;

public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            int n1 = s1.length(), n2 = s2.length();
            if(n1 != n2){
                System.out.println(Math.max(n1, n2));
            }else{
                if(s1.equals(s2)){
                    System.out.println("-1");
                }else{
                    System.out.println(n1);
                }
            }
        }
    }
}
