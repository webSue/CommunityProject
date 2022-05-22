package com.coder.algorithm.selection;

public class Selection {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length-2; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (greater(a[minIndex],a[j])){
                    minIndex = j;
                }
            }
            exch(a,i,minIndex);
        }
    }

    private static boolean greater(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
