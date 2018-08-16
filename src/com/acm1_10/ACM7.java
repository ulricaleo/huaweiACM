package com.acm1_10;

import java.util.Scanner;

/*题目描述：
* 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
* 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
* */

public class ACM7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.print((long) (f + 0.5));
    }
}
