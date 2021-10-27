package OopJava.IOFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viet Anh
 */
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocFileVanBan {
    public static void main(String[] args) {
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
