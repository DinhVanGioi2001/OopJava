package OopJava.Arrays;

import java.util.*;

public class Bo3SoPytago {
    public static boolean solution(int n, long[] arr){
        // tinh binh phuong cua tung phan tu trong mang
        for(int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
        // sap xep mang
        Arrays.sort(arr);
        // kiem tra pytago
        for(int i = n - 1; i >= 2; i--){
            int l = 0, r = i-1;
            while(l < r){
                if(arr[l] + arr[r] == arr[i])
                    return true;
                if(arr[l] + arr[r] < arr[i])
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(solution(n, arr)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
