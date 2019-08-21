package com.lgy.leetcode.easy;


/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddDigits {
    public static void main(String[] args) {

        System.out.println(addDigits(38));

    }

    public static int addDigits(int num) {
        int returnNum = 0;
        if (num <= 9) {
            return num;
        }

        int oneDigits = num % 10;//个位数
        int tenDigits = (num - oneDigits)/10;//十位数
        int temp = oneDigits + tenDigits;

        return addDigits(temp);
    }


    /**
     * 时间复杂度为O(1)的解法：
     *
     *     除个位外，每一位上的值都是通过(9+1)进位的过程得到的，想一下拨算盘进位
     *     把整数n看成n样物品，原本是以10个1份打包的，现在从这些10个1份打包好的里面，拿出1个，让它们以9个为1份打包。
     *     这样就出现了两部分的东西：
     *         原本10个现在9个1份的，打包好的物品，这些，我们不用管
     *         零散的物品，它们还可以分成：
     *             从原来打包的里面拿出来的物品，它们的总和 =》 原来打包好的份数 =》 10进制进位的次数 =》 10进制下，除个位外其他位上的值的总和
     *             以10个为1份打包时，打不进去的零散物品 =》 10进制个位上的值
     *     如上零散物品的总数，就是第一次处理num后得到的累加值
     *     如果这个累加值>9，那么如题就还需要将各个位上的值再相加，直到结果为个位数为止。也就意味着还需要来一遍如上的过程。
     *     那么按照如上的思路，似乎可以通过n % 9得到最后的值
     *     但是有1个关键的问题，如果num是9的倍数，那么就不适用上述逻辑。原本我是想得到n被打包成10个1份的份数+打不进10个1份的散落个数的和。通过与9取模，去获得那个不能整除的1，作为计算份数的方式，但是如果可以被9整除，我就无法得到那个1，也得不到个位上的数。
     *     所以需要做一下特殊处理，(num - 1) % 9 + 1
     *     可以这么做的原因：原本可以被完美分成9个为一份的n样物品，我故意去掉一个，那么就又可以回到上述逻辑中去得到我要的n被打包成10个一份的份数+打不进10个一份的散落个数的和。而这个减去的1就相当于从，在10个1份打包的时候散落的个数中借走的，本来就不影响原来10个1份打包的份数，先拿走再放回来，都只影响散落的个数，所以没有关系。
     *
     * 作者：liveforexperience
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/java-o1jie-fa-de-ge-ren-li-jie-by-liveforexperienc/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     *
     * //TODO 不懂,以后才能读懂了...
     */
    public static int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }

}