package OopJava.Collections;
import java.util.*;
public class LietKeVaDem {
    public static boolean check(int n){
        String s = "" + n;
        for(int i=0;i<s.length()-1;i++)
            if(s.charAt(i) > s.charAt(i+1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(check(n)){
                if(mp.containsKey(n))   mp.put(n, mp.get(n)+1);
                else {
                    mp.put(n, 1);
                    list.add(n);
                }
            }
        }
        Collections.sort(list, (Integer a, Integer b) -> mp.get(b).compareTo(mp.get(a)));
        for (Integer x : list)  System.out.println(x + " " + mp.get(x));
    }
}
