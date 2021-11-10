package OopJava.Collections;

import java.util.Scanner;
import java.util.Stack;

public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            solution(a, n);
        }
    }
    
    public static void solution(int[] a, int n){
        int[] r = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.empty() && a[i] >= st.peek()) st.pop();
            if(st.empty()){
                r[i] = -1;
            }else{
                r[i] = st.peek();
            }
            st.push(a[i]);
        }
        for(int i = 0; i < n; i++){
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }
}
