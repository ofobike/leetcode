package com.yang.leetcode;

/**
 * 替换字符串中的数组
 */
public class Solution {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("we love java");
        String result = replaceStr(sb);
        System.out.println(result);
    }

    private static String replaceStr(StringBuffer sb) {
        StringBuffer out = new StringBuffer();
        char[] toCharArray = sb.toString().toCharArray();
        for (int i = 0;i<toCharArray.length;i++){
            if (toCharArray[i]==' '){
                out.append("%20");
            }else {
                out.append(toCharArray[i]);
            }
        }
        return out.toString();
    }

}
