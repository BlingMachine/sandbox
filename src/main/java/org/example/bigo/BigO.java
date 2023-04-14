package org.example.bigo;

public class BigO {

    public static void main(String[] args) {

        // 6*x^4 - 2x^3 +5
        // 0(x^4) x to the 4th time
        // 100890237
        // 100000000

        // x^2 + 2*x + 5
        // 0(x^2) x squared time

        // 5
        // 0(1) constant time

        // x + 2
        // 0(x) linear time

        int[] arr = new int[2000000];
        for(int x = 0; x < arr.length - 1; x++) {
            System.out.println(arr[x]);
        }

        int sum = 0;
        for(int n = 0; n < arr.length - 1; n++) {
            sum += arr[n];
        }

        // 0(n) * 0(n) = 0(n^2)
    }
}
