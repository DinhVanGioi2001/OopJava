/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;
import java.util.*;
/**
 *
 * @author Viet Anh
 */
public class GiaoCua2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> a = new TreeSet<>();        
        Set<Integer> b = new TreeSet<>();
        for(int i = 0; i < n; i++){
            int n1 = sc.nextInt();
            a.add(n1);
        }
        for(int i =0; i < m; i++){
            int n2 = sc.nextInt();
            b.add(n2);
        }
        for(Integer i: a){
            if(b.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}