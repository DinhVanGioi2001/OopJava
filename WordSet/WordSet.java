package OopJava.WordSet;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> ts = new TreeSet<>();

    public WordSet(String s) {
        String[] tmp = s.toLowerCase().split(" ");
        for(String i: tmp){
            this.ts.add(i);
        }
    }
    
    public String union(WordSet o){
        return union(this, o);
    }
    public String union(WordSet s1, WordSet s2){
        TreeSet<String> ts = new TreeSet<>();
        for(String i: s1.ts){
            ts.add(i);
        }
        for(String i: s2.ts){
            ts.add(i);
        }
        String res = "";
        for(String i: ts){
            res += i + ' ';
        }
        return res.trim();
    }

    public String intersection(WordSet o) {
        return intersection(this, o);
    }
    
    public String intersection(WordSet s1, WordSet s2){
        TreeSet<String> ts = new TreeSet<>();
        for(String i: s1.ts){
            if(s2.ts.contains(i)){
                ts.add(i);
            }
        }
        String res = "";
        for(String i: ts){
            res += i + ' ';
        }
        return res.trim();
    }
}
