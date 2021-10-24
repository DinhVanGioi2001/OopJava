package OopJava.String;

import java.util.*;

public class SoDep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            int check = 1, n = s.length(), tmp;
            for(int i = 0; i < n/2; i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    check = 0;
                    break;
                }else{
                    tmp = s.charAt(i) - '0';
                    if(tmp != 2 && tmp != 3 && tmp != 5 && tmp != 7){
                        check = 0;
                        break;
                    }
                }
            }
            if(check == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
