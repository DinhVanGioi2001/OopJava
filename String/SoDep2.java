package OopJava.String;

import java.util.*;

public class SoDep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            int n = s.length(), sum = 0, check = 1;
            if(s.charAt(0) != '8' || s.charAt(n - 1) != '8'){
                System.out.println("NO");
            }else{
                for(int i = 0; i < s.length()/2; i++){
                    if(s.charAt(i) == s.charAt(n - i - 1)){
                        sum += ((s.charAt(i) - '0') * 2);
                    }else{
                        check = 0;
                        break;
                    }
                }
                if(check == 1 && sum % 10 == 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
