package OopJava.String;

import java.util.*;

public class SoLaMa {
    public static int value(char r){
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s = sc.next();
            int tmp1 = 0, tmp2 = 0, n = s.length();
            int sum = 0;
            for(int i = 0; i < n; i++){
                // luu gia tri bien dau tien
                tmp1 = value(s.charAt(i));
                if(i + 1 < n){
                    //lưu gia tri cua bien thu 2
                    tmp2 = value(s.charAt(i + 1));
                    if(tmp1 >= tmp2){ // xet ca bang
                        sum += tmp1;
                    }else{
                        sum += (tmp2 - tmp1);
                        // i++ la vi ta da thuc hien voi ca 2 phan tu
                        // cong i 1 lan va vong for cong 1 lan thi se vưa tron 2
                        i++;
                    }
                }else{
                    // cong voi phan tu cuoi cung
                    sum += tmp1;
                }
            }
            System.out.println(sum);
        }
    }
}
