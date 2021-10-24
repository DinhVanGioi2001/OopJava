package OopJava.Arrays;

import java.util.*;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            ds.add(arr[i]);
        }
        int flag = 1;
        while(flag == 1){
            flag = 0;
            for(int i = 0; i < ds.size() - 1; i++){
                if((ds.get(i) + ds.get(i + 1)) % 2 == 0){
                    // xoa phan tu i + 1 truoc sau do mơi xoa i
                    ds.remove(i + 1);
                    ds.remove(i);
                    flag = 1;
                    // boi vi xoa 2 phan tu nen la cho i--
                    i--;
                }
            }
        }
        System.out.println(ds.size());
    }
}
