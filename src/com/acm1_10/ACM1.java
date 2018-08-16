package com.acm1_10;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* 题目描述：
* 计算字符串最后一个单词的长度，单词以空格隔开。
* 输入描述：
* 一行字符串，非空，长度小于5000
* 输出描述：
* 整数N，最后一个单词的长度
* */

public class ACM1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                count++;
            }else break;
        }
        System.out.println(count);
    }
}
