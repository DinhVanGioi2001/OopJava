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
import java.math.BigInteger;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            BigInteger n = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            BigInteger res1 = n.divide(m);
            BigInteger res2 = m.divide(n);
            if(res1.multiply(m).equals(n) || res2.multiply(n).equals(m)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
