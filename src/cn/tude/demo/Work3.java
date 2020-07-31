package cn.tude.demo;

import java.util.Scanner;

/**
 * @author 路钰明
 * @version 1.0
 * @title: work3
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   12:00
 */
public class Work3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入运算符");
        String str=input.next();
        System.out.println("请输入计算对象");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double result = 0;

        switch (str){
            case "+":result=num1+num2;
            break;
            case "-":result=num1-num2;
            break;
            case "*":result=num1*num2;
            break;
            case "/":
                if (num2!=0){
                    result=num1/num2;
                }else
                    System.out.println("除数不能为0");
            break;
            default:
                System.out.println("运算符错误");
        }
        if(num2!=0)
        System.out.println(String.format("%.2f",result));
    }
}
