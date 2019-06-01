package com.company.Algorytmy;

public class QuickSortYWNWA {
    int[] x;

    public void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println();
    }

    public void swap(int[] x, int from, int to) {
        int temp = x[from];
        x[from] = x[to];
        x[to] = temp;
    }

//    public int[] sort(int[] x) {
//        if ()
//
//            return x;
//    }

    public void quickSort(int beg, int end, int[] x) {
        this.x = x;
        beg = 0;
        end = x.length - 1;
        if (beg == x.length) {
            return;
        }
        int pivot = beg + ((end - beg) / 2);
//        swap(x, x[pivot], x[end]);
        int temp = x[pivot];
        x[pivot] = x[end];
        x[end] = temp;
        this.x = x;
        for (int i = beg; i < end; i++) {
            for (int j = end - 1; j >= 0; j--) {
                if (i <= j) {
                    if (x[i] > x[j]) {
//                    swap(x, x[i], x[j]);
                        temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
            }
        }
        for (int i = beg; i < end; i++) {
            if (x[end] < x[i]) {
//                swap(int[] a, int pivot, int i1);
                temp = x[end];
                x[end] = x[i];
                x[i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        QuickSortYWNWA qs = new QuickSortYWNWA();
        int[] x = new int[]{8, 5, 6, 9, 10};
        qs.print(x);
        qs.quickSort(0, x.length, x);
        qs.print(x);
        System.out.println("NEXT ARRAY");
        int[] a = new int[]{12,3,2,1,14,5,4};
        qs.print(a);
        qs.quickSort(0, a.length, a);
        qs.print(a);
        System.out.println("NEXT ARRAY");
        int[] b = new int[]{4,1,4,55,4,37,8};
        qs.print(b);
        qs.quickSort(0, b.length, b);
        qs.print(b);
        System.out.println("NEXT ARRAY");
        int[] c = new int[]{1,6,3,7,9,3,2,7};
        qs.print(c);
        qs.quickSort(0, x.length, c);
        qs.print(c);

    }
}
