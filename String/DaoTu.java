package OopJava.String;

import java.util.*;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String[] s = sc.nextLine().split(" ");
            for(int i = 0; i < s.length; i++){
                for(int j = s[i].length()-1; j >= 0; j--){
                    System.out.print(s[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
