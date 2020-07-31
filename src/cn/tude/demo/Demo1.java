package cn.tude.demo;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Demo1
 * @projectName JAVASE_Day3
 * @description:三目运算符
 * @date 2020/7/17   9:31
 */
public class Demo1 {
    /**
     * 自动封箱，把基本数据类型封装为此类型的封装类类型
     * 自动拆箱，把对象里面的额数值转成基本类型数据
     * @param args
     */
    public static void main(String[] args) {


//        自动封箱
        Integer i=89;
//        自动拆箱
        Integer i2= new Integer(2);

        Integer i3= new Integer(3);
//        自动调用i2.intValue();
        System.out.println(i2+i3);


//      String类型和Integer类型的父类都是Object类型
        Object r =true?"hello":23;
        System.out.println(r);
    }
}
