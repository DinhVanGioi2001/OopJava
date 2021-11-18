package OopJava.IOFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;


/*
Bài toàn yêu cầu tìm 10 số nguyên tố lớn nhất + số lần xuất hiện 
=> sử dụng HashMap để lưu trữ kết quá
*/
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
        // Đề bài yêu cầu nhập file nhị phân và trong đó có 1 ArrayList<Integer> 
        // ArrayList là 1 đối tượng => cần sử dụng Object
        ObjectInputStream din = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>)din.readObject();
        
        // sắp xép theo thứ tự giảm dần
        // Nên sử dụng như dưới vì thao tác sẽ nhanh hơn mà không phải viết hàm compareTo
        // sort theo tăng dần thì sẽ là Integer.parseInt(i1, i2)
        // dưới đây là sort theo thứ tự giảm dần
        list1.sort((i1, i2) -> Integer.compare(i2, i1));
        // dễ hiểu mà đúng khum ^.^
        
        // Tạo 1 hashmap để lưu trữ kết quả
        HashMap<Integer, Integer> hm = new HashMap<>();
        // tao 1 ArrayList để lưu trữ 10 phần tử cần in ra
        // ở đây không sử dụng list1 là vì list 1 trong 1 giá trị sẽ có nhiều giá trị trùng lặp (1)
        ArrayList<Integer> list2 = new ArrayList<>();
        // tao bien n để đếm đủ 10 phần tử
        int n = 1;
        for(Integer i: list1){
            // kiểm tra xem trong list 2 có chứa không
            if(list2.contains(i)){
                // nếu như chứa thì cập nhập giá trị mới cho phần tử i ( tăng lên 1)
                hm.put(i, hm.get(i) + 1);
            }else{
                // nguojc lại kiểm tra xem n đã đủ 10 phần tử chưa
                // ở đây kiểm tra n <= 10 trước vì kiểm tra só nguyên tố mất quá nhiều thời gian
                // trong khi kiểm tra n <= 10 chỉ mất 1 đơn vị thời gian ( O(1) )
                if(n <= 10){
                    // kiểm tra nguyên tố
                    if(isPrime(i)){
                        // nếu la snt thì thêm vào hashMap
                        hm.put(i, 1);
                        // thêm vào list2 và tăng n lên 1 đơn vị
                        list2.add(i);
                        n++;
                    }
                }else{ // ngược lại nếu n đã đủ 10 phần tử thì break nó đi
                    break;
                }
            }
        }
        // in ra 10 phần tử ở trong list2
        // tạo list2 là không hề thừa nha :3
        // điều cuối t muốn nói nè
        // chúc c xíu ngủ ngon, mơ đẹp và học hành chăm chỉ nha
        // nếu mà có học qua ngày mới thì t chúc c có ngày mới thật vui vẻ và học hành hiểu bài nhanh nhất nha :3
        // have a good day ><
        for(Integer i: list2){
            System.out.println(i + " " + hm.get(i));
        }
    }
}
