package OopJava.Arrays;

import java.util.Scanner;

public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for(int i = 0; i < n;  i++)
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
                b[i][j] = 1;
            }
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(a[i][j] == 1)
                    if(b[i][j] != 0 && b[j][i] != 0){
                        b[i][j] = 0;
                        b[j][i] = 0;
                        System.out.print("(" + (i + 1) + "," + (j + 1) + ")\n");
                    }
    }
}
