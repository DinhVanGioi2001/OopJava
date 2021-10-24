package OopJava.String;

import java.util.*;

public class XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int test = Integer.parseInt(sc.nextLine());
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            int m = sc.nextInt();
            int count = 1;
            for(int i = 1; i < s.length(); i++){
                int check = 1;
                for(int j = 0; j < i; j++){
                    if(s.charAt(j) == s.charAt(i)){
                        check = 0;
                        break;
                    }
                }
                if(check == 1){
                    count++;
                }
            }
            if(m + count >= 26){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
