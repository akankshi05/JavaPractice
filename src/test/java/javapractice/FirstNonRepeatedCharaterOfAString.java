package javapractice;

import java.util.Scanner;

// abccade
public class FirstNonRepeatedCharaterOfAString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.next();
        String[] inp = input.split("");
        int counterRepeat=0,counterNonRepeat =0;

//aaddeeff
        //aaddeeff
        for (int i = 0; i < inp.length; i++) {
            for (int j = 0; j < inp.length; j++) {
                if (j != i) {
                    if (inp[i].equals(inp[j])) {
                        if (i == inp.length - 1 && j == inp.length - 2) {
                            System.out.println("There is no non repeated character");
                        } else {
                            break;
                        }
                    } else if (!inp[i].equals(inp[j])) {
                        if (j == inp.length - 1 && counterNonRepeat !=1) {
                            System.out.println("The first non repeated charater is " + inp[i]);
                            counterNonRepeat=1;
                        }
                    }

                }
            }



        }
    }
}