package OopJava.Collections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(n-- > 1){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(hm.containsKey(x)){
                hm.put(x, hm.get(x) + 1);
            }else{
                hm.put(x, 1);
            }
            if(hm.containsKey(y)){
                hm.put(x, hm.get(y) + 1);
            }else{
                hm.put(y, 1);
            }
        }
        int count1 = 0;
        int count2 = 0;
        for(Map.Entry<Integer, Integer> set: hm.entrySet()){
            if(set.getValue() == 1) count1++;
            else count2++;
        }
        if(count1 + count2 == c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
