package com.yang.leetcode;

import sun.font.FontUtilities;

/**
 * 从二维数组中查询数据
 */
public class FindNumInArr {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 23;
        boolean flag = findNum(target,arr);
        System.out.println("是否包含---"+flag);
    }

    /**
     * 二维数组是否包含
     * @param target
     * @param arr
     * @return
     */
    private static boolean findNum(int target, int[][] arr) {
        int row = 0;
        int col = arr[0].length -1 ;
        while (row < arr.length && col >=0){
            if (arr[row][col] == target){
                return true;
            }else if ( arr[row][col] > target){
               col -= 1;
            }else {
                row += 1;
            }
        }
        return false;
    }

}
