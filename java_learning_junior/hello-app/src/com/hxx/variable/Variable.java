package com.hxx.variable;

public class Variable {
    public static void main(String[] args) {
        // double money = 6.6;
        //System.out.println(money);

        short money = 30000;

        //4byte
        int a = 12121212;

        //默认赋值为int 若想复制为长整形需要加L/l
        //8byte
        long b = 1092748192738219L;

        //默认赋值类型为double 若想复制为float需要加F/f
        //4byte
        float c = 98.5F;

        //8byte
        double d = 99.2487246284;

        //字符类型
        char ch1 = 'a';

        //布尔类型
        boolean j1 = true;
        boolean j2 = false;

        //引用数据类型
        String name = "hxx";
        System.out.println(name);
    }
}
