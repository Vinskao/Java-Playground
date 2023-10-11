package com.tyk.m02;

public class TypeDemo {
        public static void main(String[] args) {
            int x = 10; //local variable
            System.out.println(x);

            float d = 3.4f; // 使用 'f' 后缀来表示 float 类型
            System.out.println(d);

            float f = 3.0f;
            System.out.println(f);

            long l = 30l;
            System.out.println(l);

            x = 0144;
            System.out.println(x);

            x = 0x64;
            System.out.println(x);

            x = 0x6a4e;
            System.out.println(x);

            x = 110110101;
            System.out.println(x);

            char c = 'a';
            System.out.println(c);

            String s = "abc";
            System.out.println(s);

            c = '\u0041';
            System.out.println(c);

            final double PI = 3.1416;
            int r=10;
            double a = r*r*PI;
            double b = 2*r*PI;
            System.out.println(a + ", " + b);

            System.out.println("he\rll\\o \nworld");
            System.out.print("hello");
            System.out.print("world\n");



        }
}
