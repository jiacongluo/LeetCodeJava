package com.Jiacong;

import com.Jiacong.Array.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 算法测试函数
        ArrayAlgorithm test = new ArrayAlgorithm();
        int[] nums1 = {1, 2, 2, 9};
        int[] nums2 = {9, 9};

//        int[] answer = test.intersection(nums1, nums2);
        int[] answer = test.plusOne(nums2);
        System.out.println(Arrays.toString(answer));
        while (true) {
        }
    }
}
