package com.Jiacong;
import com.Jiacong.Array.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayAlgorithm test = new ArrayAlgorithm();
        int Array[] = {-1, -100, 3, 99};
        test.rotate(Array, 2);
        for (int i = 0; i < Array.length; ++i) {
            System.out.print(Array[i] + ",");
        }
    }
}
