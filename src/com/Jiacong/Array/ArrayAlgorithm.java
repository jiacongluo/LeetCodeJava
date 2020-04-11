package com.Jiacong.Array;

import java.util.*;

public class ArrayAlgorithm {
    /*
     *@Author JiacongLuo
     *@Description //TODO LeetCode中有关数组的算法.
     *@Date 2020/4/11 6:17 下午
     **/

    //26.删除排序数组中的重复项
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

    //122.买卖股票的最佳时机||
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

    //189.旋转数组
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

    //217.存在重复元素
    public boolean containsDuplication(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (map.containsKey(nums[i])) { //如果哈希表中有相等的键值,则返回true
                return true;
            }
            map.put(nums[i], i);        //如果哈希表中没有相等的键值,则将值放入2哈希表中
        }
        return false;
    }

    //136.只出现一次的数字
    public int singleNumber(int[] nums) {
        if (nums == null) return 0;
        int num = 0;          //零和任何数异或等于它本身
        for (int n : nums) {
            num ^= n;         //利用异或
        }
        return num;
    }

    //350.两个数组的交集
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);            //先给两个数组排序
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }


}
