package com.lgy.nowcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description
 * 今年7月份vivo迎来了新入职的大学生，现在需要为每个新同事分配一个工号。人力资源部同事小v设计了一个方法为每个人进行排序并分配最终的工号，具体规则是：
 *
 *     将N（N<10000）个人排成一排，从第1个人开始报数；如果报数是M的倍数就出列，报到队尾后则回到队头继续报，直到所有人都出列；
 *
 * 最后按照出列顺序为每个人依次分配工号。请你使用自己擅长的编程语言帮助小v实现此方法。
 *
 *
 * 输入描述:
 *
 * 输入2个正整数，空格分隔，第一个代表人数N，第二个代表M：
 *
 *
 * 输出描述:
 *
 * 输出一个int数组，每个数据表示原来在队列中的位置用空格隔开，表示出列顺序：
 *
 *
 * 输入例子1:
 *
 * 6 3
 *
 *
 * 输出例子1:
 *
 * 3 6 4 2 5 1
 *
 *
 * 例子说明1:
 *
 * 6个人排成一排，原始位置编号即为1-6。最终输出3 6 4 2 5 1表示的是原来编号为3的第一个出列，编号为1的最后一个出列。
 * @Author LGy
 * @Date 2019/11/15 11:41
 **/
public class CountOff {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int[] input = CommonsUtils.parseInts(inputStr.split(" "));
        String output = solution(input);
        System.out.println(output);
    }

    private static String solution(int[] input) {

        // TODO Write your code here

        return null;
    }
}
