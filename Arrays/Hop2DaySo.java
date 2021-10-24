package OopJava.Arrays;

import java.util.*;

public class Hop2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> ds = new TreeSet<>();
        for(int i =0; i < n; i++){
            int n1 = sc.nextInt();
            ds.add(n1);
        }
        for(int i = 0; i < m; i++){
            int n2 = sc.nextInt();
            ds.add(n2);
        }
        for(Integer i : ds){
            System.out.print(i + " ");
        }
    }
}
