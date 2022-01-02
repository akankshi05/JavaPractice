package javapractice;

import java.util.Scanner;

//Q) Given an integer input array A, you need to create an integer output array B of same size such that each entry at index i, is stated as
//B[i] = A[0]*A[1]*....A[i-1]*A[i+1]*A[i+2]*....
//So, it means we have to multiply all the numbers excluding the value at that index i.
// Sample Input: {3,1,6,4}
//Output: [24, 72, 12, 18]
// B[0] = 1*6*4, B[1] = 3*6*4, B[2] = 3*1*4, B[3] = 3*1*6
public class ArrayMultiplyExcludingIndex {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] a = input.split(",");
        int multiply =1;
        int[] b = new int[a.length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length ; j++){
                if(j != i)
                {
                  multiply = multiply * Integer.parseInt(a[j]);

                }

            }
            b[i]=multiply;
            multiply=1;
            System.out.print(b[i] + ",");
        }
    }
}
