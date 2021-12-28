package javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        String lower = s.toLowerCase();

        //String[] a=lower.split("");
        List a = new ArrayList();
        a= List.of(lower.split(""));
        String reverse="";

        for( int i=(a.size()-1); i>=0; i--){

           // System.out.println(a.get(i));
            reverse = reverse+ a.get(i);

        }
        System.out.println("The reverse string is " + reverse);


        if(reverse.equals(lower)){
            System.out.println("String is Palindrome");}
            else {
                System.out.println("String is not Palindrome");
            }
        }
    }

