package com.coder.algorithm.selection;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Testselection {
    public static void main(String[] args) {
        Integer[] a = {9,8,7,6,5,4,3,2,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
