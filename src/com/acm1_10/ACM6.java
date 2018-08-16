package com.acm1_10;

import java.util.Scanner;

/*题目描述：
* 输入一个正整数，按照从小到大的顺序输出它的所有质数的因子
* （如180的质数因子为2 2 3 3 5 ）最后一个数后面也要有空格。
* */

public class ACM6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        scanner.close();
        getResult(l);
    }

    private static void getResult(long l) {
        long temp = 1;
        long i;
        while (temp < l) {
            i = 2;
            while (temp * i <= l && l % (temp * i) != 0) {
                i++;
            }
            temp = temp * i;
            if (temp <= l) {
                System.out.print(i + " ");
            }
        }
    }
}
