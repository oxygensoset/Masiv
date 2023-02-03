package org.example;

import java.util.Arrays;

public class Masiv {

    public static void main(String[] args) {
        int[] arr = {4, 9, 6, 8};
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int mul = 1;
            for (int j = 0; j < arr.length; j++) {

                if (i == j)
                    continue;
                mul *= arr[j];
            }
            output[i] = mul;
        }
        System.out.print(Arrays.toString(output));
    }
}
