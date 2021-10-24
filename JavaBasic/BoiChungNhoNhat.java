/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

/**
 *
 * @author Viet Anh
 */
import java.math.BigInteger;
import java.util.*;

public class BoiChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            BigInteger n = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            BigInteger mul = n.multiply(m);
            BigInteger gcd = n.gcd(m);
            String s = sc.next();
            System.out.println(mul.divide(gcd));
        }
    }
}
