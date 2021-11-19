/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */
public class MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> mat= new ArrayList<Integer>();
        for(int i=0;i<n*n;i++)
            mat.add(sc.nextInt());
        Collections.sort(mat);
        solution(mat, n);
    }
    
    public static void solution(ArrayList<Integer> mat,int x){
        int a[][] = new int[x][x];
        int i,k=0,l=0,m=x,n=x,j=0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                a[k][i] = mat.get(j);
                j++;
            }
            k++;
 
            for (i = k; i < m; ++i) {
                a[i][n - 1] = mat.get(j);
                j++;
            }
            n--;
 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    a[m - 1][i] = mat.get(j);
                    j++;
                }
                m--;
            }
 
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    a[i][l] = mat.get(j);
                    j++;
                }
                l++;
            }
        }
        for(int q = 0; q<x ; q++){
            for(int w = 0; w<x ; w++){
                System.out.print(a[q][w] + " ");
            }
            System.out.println("");
        }        
    }
}
