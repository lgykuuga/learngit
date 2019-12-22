package com.lgy.nowcoder;

/**
 * @Description 公用方法
 * @Author LGy
 * @Date 2019/11/15 11:50
 **/
public class CommonsUtils {

    public static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}
