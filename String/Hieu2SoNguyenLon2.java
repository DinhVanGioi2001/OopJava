/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;

import java.util.*;
import java.math.BigInteger;

public class Hieu2SoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger res = a.subtract(b);
        System.out.print(res);
    }
}
