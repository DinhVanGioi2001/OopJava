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

public class DayUuThe {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        while(test-- > 0){
//            long le =0, chan = 0, count = 0;
//            int countM = 200;
//            while(sc.hasNext() && countM > 0){
//                countM--;
//                long n = sc.nextLong();
//                if(n % 2 == 0){
//                    count++;
//                    chan++;
//                }else{
//                    count++;
//                    le++;
//                }
//            }
//            if(count % 2 == 0 && chan > le || count % 2 == 1 && chan < le){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i < a.length; i++){
                res.add(Integer.parseInt(a[i]));
            }
            int le = 0, chan = 0;
            for(int i =0; i <res.size(); i++){
                if(res.get(i) % 2 == 0){
                    chan++;
                }else{
                    le++;
                }
            }
            int tmp = res.size();
            if(tmp % 2 == 0 && chan > le  || tmp % 2 == 1 && le > chan){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
