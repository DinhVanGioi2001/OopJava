/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toan_lop_3;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Toan_Lop_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0) {
            String s = sc.nextLine();
            char[] num = new char[6];
            int dem =0;
            for(int i = 0; i < s.length(); i ++) {
                if(i < 2)
                    num[dem ++] = s.charAt(i);
                else if(i > 4 && i < 7)
                    num[dem ++] = s.charAt(i);
                else if(i > 9)
                    num[dem ++] = s.charAt(i);
            }
            char dau = s.charAt(3);
            boolean[] OK = new boolean [1];
            OK[0] = false;
            if(dau != '?') {
                if(dau == '+')
                    Cong(OK, num);
                else if(dau == '-')
                    Tru(OK, num);
            } else {
                Cong(OK, num);
                if(!OK[0])
                    Tru(OK, num);
            }
            if(!OK[0])
                System.out.println("WRONG PROBLEM!");
        }
    }
    
    public static void Cong(boolean[] OK, char[] num) {
        int[] so = new int [6];
        for(int i = 0; i < 4; i ++) {
            if(num[i] == '?') {
                if(i % 2 == 0)
                    so[i] = 1;
                else
                    so[i] = 0;
            }
            else
                so[i] = num[i] - '0';
        }
        boolean dung = false;
        while(!dung) {
            int n1 = so[0] * 10 + so[1];
            int n2 = so[2] * 10 + so[3];
            int sum = n1 + n2;
            boolean cpl = true;
            if(sum < 100) {
                for(int i = 5; i >= 4; i --) {
                    if(num[i] != '?') {
                        int s = num[i] - '0';
                        if(i == 5 && s != sum % 10) {
                            cpl = false;
                            break;
                        }
                        else if(i == 4 && s != sum / 10) {
                            cpl = false;
                        }
                    }
                }
            }
            if(cpl && sum < 100) {
                OK[0] = true;
                System.out.println(n1 + " + " + n2 + " = " + sum);
                break;
            }
            int j = 3;
            while(j >= 0) {
                if(num[j] == '?' && so[j] < 9)
                    break;
                j --;
            }
            if(j >= 0) {
                so[j] ++;
                for(int i = j + 1; i < 4; i ++) {
                    if(num[i] == '?') {
                        if(i % 2 == 0)
                            so[i] = 1;
                        else
                            so[i] = 0;
                    }
                }
            }
            else
                break;
        }
    }
    public static void Tru(boolean []OK, char[] num) {
        int[] so = new int [6];
        for(int i = 0; i < 4; i ++) {
            if(num[i] == '?') {
                if(i % 2 == 0)
                    so[i] = 1;
                else
                    so[i] = 0;
            }
            else
                so[i] = num[i] - '0';
        }
        boolean dung = false;
        while(!dung) {
            int n1 = so[0] * 10 + so[1];
            int n2 = so[2] * 10 + so[3];
            int hieu = n1 - n2;
            boolean cpl = true;
            if(hieu > 9) {
                for(int i = 5; i >= 4; i --) {
                    if(num[i] != '?') {
                        int s = num[i] - '0';
                        if(i == 5 && s != hieu % 10) {
                            cpl = false;
                            break;
                        }
                        else if(i == 4 && s != hieu / 10) {
                            cpl = false;
                        }
                    }
                }
            }
            if(cpl && hieu > 9) {
                OK[0] = true;
                System.out.println(n1 + " - " + n2 + " = " + hieu);
                break;
            }
            int j = 3;
            while(j >= 0) {
                if(num[j] == '?' && so[j] < 9)
                    break;
                j --;
            }
            if(j >= 0) {
                so[j] ++;
                for(int i = j + 1; i < 4; i ++) {
                    if(num[i] == '?') {
                        if(i % 2 == 0)
                            so[i] = 1;
                        else
                            so[i] = 0;
                    }
                }
            }
            else
                break;
        }
    }
}
