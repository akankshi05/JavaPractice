package javapractice;

import java.util.*;

public class PrintPattern {

    public static void main(String[] args) {


        String s = "I should be reversed";
        System.out.println("The sentence to be reversed...");
        System.out.println(s);

        String[] a = s.split(" ");

        System.out.println("The length of sentence is: "+a.length);

        System.out.println("Here is the reversed value....");

        for(int x=a.length;x>=1;x--)
        {
            System.out.print(a[x-1]);
            System.out.print(" ");
        }

    }
}

