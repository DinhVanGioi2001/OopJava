package OopJava.String;

import java.util.*;
/*
https://www.geeksforgeeks.org/length-longest-sub-string-can-make-removed/
*/
public class LoaiBo100 {
    static class Pair{
        char first;
        int second;
        Pair(char first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static int solution(String s){
        ArrayList<Pair> arr = new ArrayList<>();
        arr.add(new Pair('@', -1));
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            arr.add(new Pair(s.charAt(i), i));
            while(arr.size() >= 3 &&
                arr.get(arr.size() - 3).first == '1' &&
                arr.get(arr.size() - 2).first == '0' &&
                arr.get(arr.size() - 1).first == '0')
            {
                arr.remove(arr.size() - 3);
                arr.remove(arr.size() - 2);
                arr.remove(arr.size() - 1);
            }
            int tmp =  arr.get(arr.size() - 1).second;
            maxLen = Math.max(maxLen, i - tmp);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            System.out.println(solution(s));
        }
    }
}
