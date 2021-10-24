package OopJava.JavaBasic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class GiaiPTBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0 && b == 0){
            System.out.print("VSN");
        }else if(a == 0){
            System.out.print("VN");
        }else{
            double res = -b/a;
            System.out.printf("%.2f", res);
        }
    }
}
