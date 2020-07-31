package cn.tude.demo;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Demo
 * @projectName JAVASE_Day3
 * @description:
 * @date 2020/7/17   16:36
 */
public class Demo {
    public static void main(String[] args) {
        out:for (int i=1;i<=5;i++){
                for(int j=1;j<=4;j++){
                    if(j==2){
                        break  out;
//                        跳出整个循环

                    }
                    System.out.println(j);
                    System.out.println("\t");
                }
            System.out.println();
        }
    }
}
