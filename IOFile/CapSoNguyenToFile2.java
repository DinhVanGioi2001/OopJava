package OopJava.IOFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author suckm
 */
public class CapSoNguyenToFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        
        f = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(f);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
        
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer i:list1){
            if(isPrime(i)){
                int temp = 1000000 - i;
                if(isPrime(temp) && list1.contains(temp) && i<temp){
                    if(!list2.contains(i) && !list2.contains(temp)){
                        res.add(i);
                    }
                }
            }
        }
        Collections.sort(res);
        for(Integer i:res){
            System.out.println(i + " " + (1000000 - i));
        }
    }
    
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
