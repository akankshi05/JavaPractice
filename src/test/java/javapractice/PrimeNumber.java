package javapractice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        Scanner n = new Scanner(System.in);
        System.out.println("Please enter a number to check if prime or not...");
        int x = n.nextInt();
        int s=0;


        int z=1;
         for(int i=2 ; i<x ;i++){
               s = x%i;
             if (s == 0)
             {   z=z+1;
                 System.out.println("No. is not prime");
                 break;
             }

         }
         if(z==1){
             System.out.println("Number "+x+" is a prime");}



    }
}
