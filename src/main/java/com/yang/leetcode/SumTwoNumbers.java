package com.yang.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        //int[] result = getTwoNumber(nums, target);
        //System.out.println(Arrays.toString(result));
        int[] numbers = towNumber(nums, target);
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * 方法一:返回目标数组下标
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] getTwoNumber(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("查询不到数据");
    }

    /**
     * 方法二
     *
     * @return
     */
    private static int[] towNumber(int[] nums, int target) {
        //定义Map集合保存数组中的数据
        Map<Integer, Integer> map = new HashMap<>();
        //循环数据
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        //循环map集合
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            //输出key
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"\t"+value);
            //key   value
            //2	     0
            //7	     1
            //11	 2
            //15	 3
        }
        //开始计算
        for (int i = 0;i<nums.length;i++){
            int objective = target - nums[i];
            if (map.containsKey(objective) && map.get(objective)!=i){
                return new int[]{i,map.get(objective)};
            }
        }
        throw new RuntimeException("查询不到数据");
    }
}
