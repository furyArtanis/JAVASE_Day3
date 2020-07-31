package cn.tude.demo;

import java.util.Scanner;

/**
 * @author 路钰明
 * @version 1.0
 * @title: work2
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   11:43
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//      1.  计算该年天数
        System.out.println("请输入年份");
        int year= input.nextInt();
        System.out.println("请输入月份");
        int m= input.nextInt();
        boolean run=false;
        int day;
        if(year%4==0&&year%100!=0||year%400==0){
            run=true;
        }

        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            day=31;
            System.out.println(year+"年的"+m+"月有"+day+"天");
        }
       else if(m==4||m==6||m==9||m==11){
            day=30;
            System.out.println(year+"年的"+m+"月有"+day+"天");
        }
      if(m==2) {
          if (run == true) {
              day = 29;
          } else {
              day = 28;
          }
          System.out.println(year+"年的"+m+"月有"+day+"天");
      }



    }
}
