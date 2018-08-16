package com.acm1_10;

/*题目描述：
 *写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。
 *  */

import java.util.Scanner;

public class ACM5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            System.out.println(hexToDec(string.substring(2)));
        }
    }

    private static int hexToDec(String string) {
        int base = 16;
        int dec = charToDec(string.charAt(string.length() - 1));
        for (int i = string.length() - 2; i >= 0; i--) {
            dec += charToDec(string.charAt(i)) * base;
            base *= 16;
        }
        return dec;
    }

    private static int charToDec(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return ch - 'A' + 10;
        } else if (ch >= 'a' && ch <= 'f') {
            return ch - 'a' + 10;
        }
        return ch - 48;
    }
}
