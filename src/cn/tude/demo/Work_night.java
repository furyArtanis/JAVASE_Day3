package cn.tude.demo;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Work_night
 * @projectName JAVASE_Day3
 * @description:百钱百鸡
 * @date 2020/7/17   15:37
 */

/**
 * 公鸡5文钱1只，母鸡3文钱1只，小鸡3只1文钱，100文钱买100只鸡，怎么买？
 */
public class Work_night {

    public static void main(String[] args) {


        for(int i=0;i<=20;i++){
            for(int j=0;j<33;j++){

                    if(i*5+j*3+(100-i-j)/3==100&& (100 - i - j)%3 == 0){
                        System.out.println("公鸡"+i+"只,"+"母鸡"+j+"只,"+"小鸡"+(100 - i - j)+"只");

                }
            }
        }
    }
}
