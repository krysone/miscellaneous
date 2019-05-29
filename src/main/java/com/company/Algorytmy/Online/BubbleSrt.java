package com.company.Algorytmy.Online;

public class BubbleSrt {
    boolean swap;

    public void print(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }
        System.out.println();
    }

    public void swap(int high, int low){
        int temp = high;
        high = low;
        low = temp;
        swap = true;
    }

    public void sort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            swap = false;
            do {

                for (int j = 0; j < (x.length - 1); j++) {
                    swap = false;
                    if (x[j] > x[j + 1]) {
                        swap = true;
                        int temp = x[j];
                        x[j] = x[j + 1];
                        x[j + 1] = temp;
//                    swap(x[j],x[j+1]);

                    }
                }
            } while (swap == true);
        }
    }


    public static void main(String[] args) {
        BubbleSrt sort1 = new BubbleSrt();
        int[] a = new int[]{6,2,3,7,1,3,2,10};
        sort1.print(a);
        sort1.sort(a);
        sort1.print(a);

    }
}
