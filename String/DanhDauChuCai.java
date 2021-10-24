package OopJava.String;

import java.util.*;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            int check = 0;
            for(int j = 0; j < i; j++){
                if(s.charAt(i) == s.charAt(j)){
                    check = 1;
                    break;
                }
            }
            if(check == 0) count++;
        }
        System.out.println(count);
    }
}
