package com.Jiacong;
import com.Jiacong.Array.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 算法测试函数
        ArrayAlgorithm test = new ArrayAlgorithm();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] answer = test.intersection(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
}
