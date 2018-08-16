package com.acm1_10;

import java.io.IOException;
import java.io.InputStream;

/* 题目描述：
* 计算字符串最后一个单词的长度，单词以空格隔开。
* 输入描述：
* 一行字符串，非空，长度小于5000
* 输出描述：
* 整数N，最后一个单词的长度
* */

public class ACM1 {
    public static void main(String[] args) throws IOException {
        InputStream stream = System.in;
        byte[] bytes = new byte[5000];
        int length = stream.read(bytes);
        String string = new String(bytes,0,length-1);
        String[] strings = string.split(" ");
        System.out.println(strings[strings.length - 1].length());
    }
}
