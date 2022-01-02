package javapractice;

import java.util.Scanner;

public class MaxnMin {


    public static void main(String[] args) {

        System.out.println("Enter the string.....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int ctr[] = new int[256];
        int l = input.length();
        for (int i = 0; i < l; i++)
            ctr[input.charAt(i)]++;
        int max = -1;
        char result = ' ';

                    for (int i = 0; i < l; i++) {
                        if (max < ctr[input.charAt(i)]) {
                            max = ctr[input.charAt(i)];
                            result = input.charAt(i);
                        }
                    }
        System.out.println(result);


    }
}
