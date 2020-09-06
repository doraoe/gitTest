package com.example.demogit.shuju;

public class ErFenDeno {


    private int erSearch(int[] a, int num) {
        int left = 0;
        int right = a.length - 1;
        while (true) {
            int mid = (left + right) / 2;
            if (num == a[mid]) {
                return mid;
            } else if (num < a[mid]) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        ErFenDeno erFenDeno = new ErFenDeno();
        int[] a = {1, 2, 3, 4, 5, 7, 9, 22, 77};
        int index = erFenDeno.erSearch(a, 3);
        System.out.println(index);
    }
}