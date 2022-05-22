package com.coder.algorithm.bubble.test;

import com.coder.algorithm.bubble.sort.Bubble;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBubble {
    public static void main(String[] args) {
        Integer[] arr = {2,1,8,4,7,10,9};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
