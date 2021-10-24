package OopJava.String;

import java.util.*;
import java.math.BigInteger;

public class Hieu2SoNguyenLon1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        while(t-->0){
//            String str1=sc.nextLine();
//            String str2=sc.nextLine();
//            System.out.println(sub(str1, str2));
//        }
//        sc.close();
//    }
//    public static boolean isSmaller(String str1, String str2)
//    {
//        int n1 = str1.length(), n2 = str2.length();
// 
//        if (n1 < n2)
//            return true;
//        if (n2 < n1)
//            return false;
// 
//        for (int i = 0; i < n1; i++) {
//            if (str1.charAt(i) < str2.charAt(i))
//                return true;
//            else if (str1.charAt(i) > str2.charAt(i))
//                return false;
//        }
//        return false;
//    }
//    public static String sub(String str1,String str2){
//        if(isSmaller(str1, str2)){
//            String s=str1;
//            str1=str2;
//            str2=s;
//        }
//        int n1=str1.length(),n2=str2.length();
//        int carry=0;
//        StringBuilder result=new StringBuilder();
//        while(--n1>=0&&--n2>=0){
//            int res=(int)(str1.charAt(n1)-str2.charAt(n2)-carry);
//            if(res<0){
//                res+=10;
//                carry=1;
//            }
//            else{
//                carry=0;
//            }
//            result.append((char)(res+'0'));
//        }
//        if(n1>=0){
//            for(int i=n1;i>=0;i--){
//                int res=(int)(str1.charAt(i)-'0'-carry);
//                if(res<0){
//                    res+=10;
//                    carry=1;
//                }
//                else{
//                    carry=0;
//                }
//                result.append((char)(res+'0'));
//            }
//        }
//        result.reverse();
//        return result.toString();
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String a = sc.next();
            String b = sc.next();
            BigInteger n1 = new BigInteger(a);            
            BigInteger n2 = new BigInteger(b);
            String res = n1.subtract(n2).abs().toString();
            int n = 0;
            // kiem tra xem xau a co lon hon hay khong
            if(a.length() > b.length()){
                n = a.length();
            }else{
                n = b.length();
            }
            if(res.length() < n){
                for(int i = 0; i < n - res.length(); i++){
                    System.out.print("0");
                }
            }
            System.out.println(res);
        }
    }
}
