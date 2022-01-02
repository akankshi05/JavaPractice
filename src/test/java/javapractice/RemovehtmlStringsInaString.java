package javapractice;

import java.util.Scanner;

public class RemovehtmlStringsInaString {

    //Q) Remove html tags in a string
    //Sample Input: <h1>Hello World!</h1> <p>something</p>
   // Output: Hello World! something
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        input= input.replaceAll("\\<.*?\\>","");
        System.out.println(input);


    }
}
