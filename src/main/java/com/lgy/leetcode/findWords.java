package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 *
 *
 * 注意：
 *
 *     你可以重复使用键盘上同一字符。
 *     你可以假设输入的字符串将只包含字母。
 *

 */
public class findWords {

    public static void main(String[] args) {
        System.out.println(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }

    public static String[] findWords(String[] words) {

        if (words == null || words.length == 0) {
            return new String[]{};
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('Q', 1);
        map.put('W', 1);
        map.put('E', 1);
        map.put('R', 1);
        map.put('T', 1);
        map.put('Y', 1);
        map.put('U', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('P', 1);

        map.put('A', 2);
        map.put('S', 2);
        map.put('D', 2);
        map.put('F', 2);
        map.put('G', 2);
        map.put('H', 2);
        map.put('J', 2);
        map.put('K', 2);
        map.put('L', 2);

        map.put('Z', 3);
        map.put('X', 3);
        map.put('C', 3);
        map.put('V', 3);
        map.put('B', 3);
        map.put('N', 3);
        map.put('M', 3);

        List<String> list = new ArrayList<>();

        for(String word : words) {
            String s = word.toUpperCase();
            int temp = map.get(s.charAt(0));
            boolean flag = true;
            for (int i = 1; i< s.length(); i++){
                if (map.get(s.charAt(i)) != temp){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(word);
            }

        }

        String[] result = new String[list.size()];
        for (int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;

    }
}
