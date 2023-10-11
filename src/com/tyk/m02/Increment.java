package com.tyk.m02;

public class Increment {
    public static void main(String[] arg){
        int x = 3, y = 4, a;
//        a = ++x*y;
//        a = x+++y;
        a = (x++)*y;
        System.out.println("x=" +x + ", y=" + y + ", a=" +a );
    }
}
