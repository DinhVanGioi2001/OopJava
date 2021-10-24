/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;

/**
 *
 * @author Viet Anh
 */
import java.util.*;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email[] = new String[100];
        int i, j, n = Integer.parseInt(sc.nextLine());
        for(i = 0; i < n; i++){
            String hoTen = sc.nextLine().trim().toLowerCase();
            String[] ds = hoTen.split("\\s+");
            StringBuilder tmp = new StringBuilder(ds[ds.length - 1]);
            for(j = 0; j < ds.length - 1; j++){
                tmp.append(ds[j].charAt(0));
            }
            email[i] = tmp.toString();
        }
        for(i = 0; i < n; i++){
            int d = 1;
            for(j = i - 1; j >= 0; j--){
                if(email[i].equals(email[j])){
                    d++;
                }
            }
            if(d == 1){
                System.out.print(email[i]);
            }else{
                System.out.print(email[i] + d);
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}
