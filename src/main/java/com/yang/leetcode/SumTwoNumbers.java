package com.yang.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class SumTwoNumbers {
    public static void main(String[] args) {
        //原数据
        int[] nums = {2, 7, 11, 15};
        //目标数
        int target = 9;
        int[] result = getTwoNumber(nums,target);
        System.out.println(Arrays.toString(result));
    }

    /**
     * 返回目标数组下标
     * @param nums
     * @param target
     * @return
     */
    private static int[] getTwoNumber(int[] nums, int target) {
        for (int i =0;i<nums.length;i++){
            for (int j= i+1;j<nums.length;j++){
                if (nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new RuntimeException("查询不到数据");
    }
}
