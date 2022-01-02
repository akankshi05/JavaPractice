package javapractice;

import java.util.Scanner;

//Q) Given an integer input array A, you need to create an integer output array B of same size such that each entry at index i, is stated as
//B[i] = A[0]*A[1]*....A[i-1]*A[i+1]*A[i+2]*....
//So, it means we have to multiply all the numbers excluding the value at that index i.
// Sample Input: {3,1,6,4}
//Output: [24, 72, 12, 18]
// B[0] = 1*6*4, B[1] = 3*6*4, B[2] = 3*1*4, B[3] = 3*1*6

public class ArrayMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] a = x.split("");

        //int[] a ={3,0,6,4};

        int z = 1;
        int[] b = new int[a.length];
        int counter = 0;


        for (int i = 0; i < a.length; i++) {

            if (Integer.parseInt(a[i]) != 0) {
                z = z * (Integer.parseInt(a[i]));
            } else if (Integer.parseInt(a[i]) == 0) {
                counter = counter + 1;
            }
        }

        if (counter == 0) {
            for (int j = 0; j < a.length; j++) {
                b[j] = z / (Integer.parseInt(a[j]));
                System.out.print(b[j] + ",");
            }
        } else if (counter == 1) {
            for (int k = 0; k < a.length; k++) {
                if (Integer.parseInt(a[k]) == 0) {
                    b[k] = z;
                } else {
                    b[k] = 0;
                }
                System.out.print(b[k]+ ",");
            }

        } else if (counter > 1) {
            for (int l = 0; l < a.length; l++) {
                b[l] = 0;
                System.out.print(b[l]+ ",");
            }
        }
    }
}


