package OopJava.String;

import java.util.Scanner;


public class BienSoDep {
    
    public static boolean tang(String s){
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            s = s.replaceAll(".", "");
            s = s.substring(5);
        }
    }
}
