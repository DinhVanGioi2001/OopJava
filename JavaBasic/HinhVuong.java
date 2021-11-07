/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopJava.JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Point> point = new Vector<>();
        ArrayList<Point> l = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            Point p = new Point(sc.nextInt(), sc.nextInt());
            point.add(p);
        }
        point.sort((i1, i2) -> Integer.compare(i2.getX(), i1.getX()));
        int width = point.firstElement().getX() - point.lastElement().getX();
        point.sort((i1, i2) -> Integer.compare(i2.getY(), i1.getY()));
        int len = point.firstElement().getY() - point.lastElement().getY();
        int res = Math.max(width, len);
        System.out.println(res*res);
    }
}

class Point{
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
