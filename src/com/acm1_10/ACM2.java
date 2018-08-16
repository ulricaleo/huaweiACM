package com.acm1_10;

/*题目描述：
* 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，
* 然后输出输入字符串中含有该字符的个数。不区分大小写。
* 输入描述：
* ABCDF12 A
* 输出描述：
* 1*/

import java.util.Scanner;

public class ACM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        char ch = scanner.next().charAt(0);
        scanner.close();
        int count = 0;
        for (char c : chars) {
            if (ch - c == 0|| ch -c == -32 || ch - c == 32) {
                count++;
            }
        }
        System.out.println(count);
    }
}
