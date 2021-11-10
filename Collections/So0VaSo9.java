package OopJava.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            solution(n);
        }
    }
    public static void solution(int n){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while(!q.isEmpty()){
            String tmp = q.poll();
            long res = Long.parseLong(tmp);
            if(res % n == 0){
                System.out.println(res);
                break;
            }
            q.add(tmp + "0");
            q.add(tmp + "9");
        }
    }
}
