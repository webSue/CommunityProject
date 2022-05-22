package com.coder.algorithm.insertion;

import com.coder.algorithm.selection.Selection;

import java.util.Arrays;

public class TestInsertion {
    public static void main(String[] args) {
        Integer[] a = {9,8,7,6,5,4,3,2,1};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
