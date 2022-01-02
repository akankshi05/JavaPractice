package javapractice;

import java.util.Scanner;

public class squarerootofanumber {

    // 49 - 7*7

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

         int counter=0;
        for(int i =2; i<=number; i++){

            if(number/i == i && number%i ==0){
                System.out.println("Square root of the number is " + i);
                counter=1;
                break;
            }
            }
        if(counter ==0){
            System.out.println("Square root not found");

        }

    }
}
