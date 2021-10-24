package OopJava.String;

import java.util.*;

public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s = sc.next();
            int oddNum = 0, evenNum = 0;
            for(int i = 0; i < s.length(); i++){
                int tmp = s.charAt(i) - '0';
                if(i % 2 == 0){
                    evenNum += tmp;
                }else{
                    oddNum += tmp;
                }
            }
            if((oddNum - evenNum) % 11 == 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
