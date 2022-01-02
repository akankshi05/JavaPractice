package javapractice;

import java.util.Scanner;

public class Factorial {
    // 5 = 5*4*3*2*1
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int output = 1;

        System.out.print("The factorial of the entered number is ");
        for(int i =1; i<=input ; i++){
            System.out.print(i+ "*");
            output = output* i;
        }
        System.out.print("=");
        System.out.println( output);


    }
}
