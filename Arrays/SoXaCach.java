/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */
public class SoXaCach {
    public static int n;
    public static int X[] = new int[100];
    public static int unused[] = new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            n = sc.nextInt();
            for(int j=1;j<=n;j++) unused[j] = 1;
            BackTrack(1);
            System.out.println("");
        }
    }
    
    public static void BackTrack(int i){	
	for(int j=1; j<=n; j++){
            if(unused[j]==1){	
                X[i]=j;		
                unused[j]=0;	
                if(i==n){
                    if(isFarNum()){
                        display();
                    }
                }
                else		
                    BackTrack(i+1);
                unused[j]=1;	
            }
	}
	return;
    }
    public static void display(){
	for(int j=1; j<=n; j++) {
            System.out.print(X[j]);
        }
        System.out.println();
    }
    
    public static boolean isFarNum(){
        for(int j=1; j<=n-1; j++) {
            if( Math.abs(X[j] - X[j+1]) == 1 ){
                return false;
            }
        }
        return true;
    }
}
