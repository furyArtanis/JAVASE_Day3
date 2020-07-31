package cn.tude.demo;

import java.util.Scanner;

/**
 * @author 路钰明
 * @version 1.0
 * @title: word1
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   11:30
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        1.输出偶数

        System.out.println("请输入一个整数");
        int num=input.nextInt();
        if(num%2==0) {
            System.out.println(num);
        }

//     2.判断重量对应付费
        System.out.println("请输入重量");
        double weight=input.nextDouble();
        double money;
        if(weight<=20&&weight>0){
            money=weight*0.35;
            System.out.println("应付"+money+"元");
        }else if (weight>20&&weight<=100){
            money=20*0.35+(weight-20)*0.5;
            System.out.println("应付"+money+"元");
        }else if (weight>100){
            money=20*0.35+80*0.5+(weight-100)*0.8;
            System.out.println("应付"+money+"元");
        }else{
            System.out.println("请输入正确重量");
        }

    }
}
