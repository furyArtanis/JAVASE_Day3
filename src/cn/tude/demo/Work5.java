package cn.tude.demo;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Work5
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   16:39
 */
public class Work5 {
    //    输出2-1000，所有的素数
    public static void test1() {
        int num=0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 ) {
                    num++;
                }
            }
            if(num==1){
                System.out.print(i+" ");
            }
            num=0;
        }
    }
//    求4的阶乘的和4！+3！+2！+1
    public  static void test2(){
        int  num=1;
        int  n=0;
        for(int i=1;i<5;i++){

            for(int j=1;j<=i;j++){
                num*=j;
            }
            n+=num;
            num=1;
        }
        System.out.println(n);
    }

    //    输出2-1000，所有的素数
    public  static void test3(){
        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j < i; j++) {


            }
            }
    }

        public static void main (String[]args){
//            Work5.test1();
//            Work5.test2();  33
//
        }

    }

