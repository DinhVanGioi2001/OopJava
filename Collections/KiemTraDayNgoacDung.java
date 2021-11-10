package OopJava.Collections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    static HashMap<Character, Character> brack_map = new HashMap<>();
    
    static{
        brack_map.put(')', '(');        
        brack_map.put('}', '{');
        brack_map.put(']', '[');
    }
    
    public static boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        char temp;
        for(int i = 0; i < s.length(); i++){
            temp = s.charAt(i);
            if(temp == '(' || temp == '{' || temp == '['){
                stack.push(temp);
            }else{
                if(stack.empty() || stack.peek() != brack_map.get(temp)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            if(solution(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
