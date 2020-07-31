package cn.tude.demo;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Demo7
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   15:42
 */
public class Demo7 {
    public  static void test1(){
     for(int i=1;i<=9;i++){
         for(int j=1;j<=i;j++){
             System.out.print(j+"*"+i+"="+i*j+" ");
         }
         System.out.println();
     }
    }

    public static void main(String[] args) {
        Demo7.test1();


    }
}
