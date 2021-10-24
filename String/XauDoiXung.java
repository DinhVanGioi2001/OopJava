/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.String;
import java.util.*;
/*
bai bat buoc phai thay doi dung 1 ky tu
*/
public class XauDoiXung {
    public static boolean doiXung(String s){
        // kiem tra mang doi xung
        int count = 0;
        for(int i =0;i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                count++;
            }
        }
        //neu mang le va count = 0 thi chi can doi cho phan tu o giua
        if(s.length() % 2 == 1 && count == 0){
            return true;
        }
        // neu chi co 1 phan tu chua doi cho thi tra ve true
        if(count == 1){
            return true;
        }
        // nguoc lai tra ve false
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            if(doiXung(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
