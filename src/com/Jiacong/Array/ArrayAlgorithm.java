package com.Jiacong.Array;

import java.util.HashMap;
import java.util.Map;

public class ArrayAlgorithm {
    /*
     *@Author JiacongLuo
     *@Description //TODO 有关数组的算法
     *@Date 2020/4/11 6:17 下午
     **/


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[i] != nums[j]) {
                ++i;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int sell = 1, buy = 0; sell < prices.length; ++sell) {
            if (prices[sell] > prices[buy]) {   //如果出售日价格大于买入日，则将股票卖出
                maxProfit += (prices[sell] - prices[buy]);
                buy = sell;                     //在出售日又买入股票
            }
            if (prices[buy] > prices[sell]) {   //如果买入价格比后面的出售价格高,则将股票在买入日当天出售
                buy = sell;                     //在出售日又买入股票
            }
        }
        return maxProfit;
    }


    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return;
        int temp;
        for (int i = 0; i < k; ++i) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; --j) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }


    public boolean containsDuplication(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (map.containsKey(nums[i])) { //如果哈希表中有相等的值,则返回true
                return true;
            }
            map.put(nums[i], i);        //如果哈希表中没有相等的值,则将值放入哈希表中
        }
        return false;
    }


}
