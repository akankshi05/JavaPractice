package javapractice;

import java.util.Scanner;

public class CheckVowelPresentInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        String[] vowel = input.split("");
        //StringBuilder sce= new StringBuilder();
        String sce = "";
        int counter=0;
        for (int i = 0; i < vowel.length; i++) {
            if (vowel[i].matches("[aeiou]")) {
                //System.out.println("Vowel is present");
                sce = sce+vowel[i];
                counter ++;
            }
        }
        if(counter==0){
            System.out.println("No vowel present");
        }
        else{
            System.out.println("Vowels present are "+ sce);
        }
    }
}
