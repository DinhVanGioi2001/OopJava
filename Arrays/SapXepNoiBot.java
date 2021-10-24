package OopJava.Arrays;

import java.util.*;

public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int count = 1;
        for(int j = 0; j < n -1; j++){
            int check = 0;
            for(int i = 0; i < n - j - 1; i++){
                if(a[i] > a[i + 1]){
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i + 1] = tmp;
                    check = 1;
                }
            }
            if(check == 1){
                System.out.print("Buoc " + count++ + ": ");
                for(int h = 0; h < n; h++){
                    System.out.print(a[h] + " ");
                }
                System.out.println();
            }
        }
    }
}
