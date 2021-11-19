/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.Arrays;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Viet Anh
 */
public class DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n,i=0;
            long k,sum = 0;
            boolean flag = false,existZero = false;
            Vector<Long> a= new Vector();
            n = sc.nextInt();
            k = sc.nextLong();
            sc.nextLine();
            for(int j=0;j<n;j++){
                a.add(sc.nextLong());
                sum += a.lastElement();
                if(a.lastElement() == 0) existZero = true;
                while(sum > k){
                    sum -= a.elementAt(i);
                    i++;
                }
                if(sum == k) flag = true;
            }
            if(!flag || (!existZero && k==0)){ //trường hợp nếu ko tồn tại số 0 mà tổng k = 0
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
