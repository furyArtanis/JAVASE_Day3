package cn.tude.demo;

import java.util.Scanner;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Demo3
 * @projectName JAVASE_Day3
 * @description:控制台输入
 * @date 2020/7/17   10:10
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//        String str=  sc.next();
//        System.out.println("请输入整数");
//        int i= sc.nextInt();
//        System.out.println("请输入一个数");
//        float f= sc.nextFloat();
//        System.out.println("请输入一个数");
//        double d= sc.nextDouble();
//        System.out.println(str+","+i+","+","+f+","+d);

//      接收键盘输入的3个int的数，打印最大值，使用三元运算符实现
        System.out.println("请输入三个数");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int r1=a1>a2?a1:a2;
        int r2=r1>a3?r1:a3;
        System.out.println("这三个数的最大值为："+r2);
        int r4,r5;
        int r3=a1>a2?(r4=a1>a3?a1:a3):(r5=a2>a3?a2:a3);

        System.out.println("这三个数的最大值为："+r3);

        int r6=a1>a2?(Math.max(a1,a3)):(Math.max(a2,a3));
        System.out.println("这三个数的最大值为："+r6);

        System.err.println("数字错误");
    }
}
