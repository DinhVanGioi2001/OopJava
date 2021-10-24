package OopJava.String;

import java.util.*;

public class SoUuThe {
    public static void solution(String s){
        int check = 0, n = s.length();
        for(int i = 0;i < n; i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                check = 1;
                break;
            }
        }
        if(check == 1 || s.charAt(0) == '0'){
            System.out.println("INVALID");
        }else{
            int odd = 0, even = 0, count = 0;
            for(int i = 0; i < n; i++){
                count++;
                if((s.charAt(i) - '0') % 2 == 0){
                    odd += 1;
                }else{
                    even += 1;
                }
            }
            if(odd == even || (count % 2 == 1 && odd > even) ||
                    (count % 2 == 0 && odd < even)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String s = sc.next();
            solution(s);
        }
    }
}
