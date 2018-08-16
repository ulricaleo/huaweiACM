package com.acm1_10;

import java.util.*;

/*题目描述：
* 去重并排序
* 输入描述：
* 输入多行，先输入随机整数的个数，再输入相应个数的整数
* 输出描述：
* 排序的数字
* */

public class ACM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        scanner.close();
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
