/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.IOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viet Anh
 */
public class ChuanHoaHoTenFile {
    public static void main(String[] args) {
        try {   
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextLine()){
                String tmp = sc.nextLine();
                if(tmp.equals("END")) break;
                String[] s = tmp.trim().toLowerCase().split("\\s+");
                String res = "";
                for(int i = 0; i < s.length; i++){
                    res += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
                }
                System.out.println(res.trim());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
