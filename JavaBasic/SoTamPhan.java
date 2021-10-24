package OopJava.JavaBasic;

import java.util.*;

public class SoTamPhan {
    public static int solution(String n){
        for(int i = 0; i < n.length(); i++){
            char tmp = n.charAt(i);
            if(tmp != '0' && tmp != '1' && tmp != '2') return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String n = sc.next();
            int res = solution(n);
            if(res == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
