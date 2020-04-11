package com.Jiacong.Array;

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




















}
