package cn.tude.demo;

import java.util.Scanner;

/**
 * @author 路钰明
 * @version 1.0
 * @title: work4
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   14:34
 */
public class Work4 {
//    1-100以内所有奇数和
    public static void test1(){
        int sum=0;
        for(int i =1;i<=100;i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }
// 打印能被3整除不能被7整除的数
    public static void test2(){
        int num;
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%7!=0){
                System.out.print(i+",");
            }
        }
    }
//数的位数
    public static void test3(){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int i=1;
        while (num>=10){
            num=num/10;
            i++;
        }
        System.out.println(i);
    }
//数的因数
    public static void test4(){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
       for (int i=1;i<=num;i++){
           if(num%i==0){
               System.out.print(i+",");
           }
       }

    }

    public static void main(String[] args) {
//       work4.test1(); 2500
//          work4.test2();
//        3,6,9,12,15,18,24,27,30,33,36,39,45,48,51,54,57,60,66,69,72,75,78,81,87,90,93,96,99,
//        work4.test3();
        Work4.test4();

    }
}
