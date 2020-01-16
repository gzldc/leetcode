package com.example.leetcode.solution;

/**
 * <p>
 * 描述:
 * </p>
 * <p>
 * 创建时间: 2020/1/16 下午2:05
 * </p>
 *
 * @author shishuai
 */

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 */
public class Solution3 {
    public static int reverse(int x) {
       int answer = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (x != 0) {
            int temp = x % 10;
            if (answer > max / 10 || (answer == max / 10 && temp > max % 10)) {
                return 0;
            }
            if (answer < min / 10 || (answer == min / 10 && temp < min % 10 )){
                return 0;
            }
            answer = answer * 10 + temp;
            x /= 10;
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(reverse(125));
    }
}
