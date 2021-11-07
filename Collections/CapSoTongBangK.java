package OopJava.Collections;

import java.util.*;

public class CapSoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int n = sc.nextInt();
            long sum = sc.nextLong();
            Long[] a = new Long[n];
            HashMap<Long, Integer> hm = new HashMap<>();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                if(hm.containsKey(a[i])){
                    hm.put(a[i], hm.get(a[i]) + 1);
                }else{
                    hm.put(a[i], 1);
                }
            }
            long count = 0;
            for(int i = 0; i < n; i++){
                if(hm.get(sum - a[i]) != null){
                    count += hm.get(sum-a[i]);
                }
                // có thể có t/h trùng nhau
                if(sum - a[i] == a[i]){
                    count--;
                }
            }
            // chia cho 2 vi lap lai 2 lan
            System.out.println(count/2);
        }
    }
}
