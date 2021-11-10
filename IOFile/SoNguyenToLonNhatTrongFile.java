package OopJava.IOFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class SoNguyenToLonNhatTrongFile {
    
    public static boolean isPrime(int n){
        if(n < 2) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream din = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)din.readObject();
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.sort((i1, i2) -> Integer.compare(i2, i1));
        int n = 1;
        for(Integer i: list1){
            if(list2.contains(i)){
                hm.put(i, hm.get(i) + 1);
            }else{
                if(n <= 10){
                    if(isPrime(i)){
                        hm.put(i, 1);
                        list2.add(i);
                        n++;
                    }
                }else{
                    continue;
                }
            }
        }
        for(Integer i: list2){
            System.out.println(i + " " + hm.get(i));
        }
    }
}
