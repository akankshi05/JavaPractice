package javapractice;

import java.util.Scanner;

public class ArmsstrongNumber {

    public static void main(String [] args){

       // 1*3 + 5*3 + 3*3

                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                String s = String.valueOf(x);
                String[] number = s.split("");
                int sum =0;

                for(String i: number){

                      int y =Integer.parseInt(i);
                    sum = sum +(int)(Math.pow(y,3));

                }
                if(sum == x)
                {
                    System.out.println("Amstrong");
                }
                else {
                    System.out.println("Not amstrong");
                }

    }
}
