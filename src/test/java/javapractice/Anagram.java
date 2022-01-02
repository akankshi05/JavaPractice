package javapractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String s1 = sc.nextLine();
        System.out.println("Enter second word");
        String s2 = sc.nextLine();
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        String[] first = s1.split("");
        String[] second = s2.split("");
        int counter = 0;

        List<String> lfirst1 = Arrays.asList(first);
        List<String> lfirst2 = Arrays.asList(second);

        Collections.sort(lfirst1);
        Collections.sort(lfirst2);

        System.out.println(lfirst1);
        System.out.println(lfirst2);

        if(lfirst1.size() == lfirst2.size()){
            for(int i=0; i< lfirst1.size();i++){

                if(!lfirst1.get(i).equalsIgnoreCase(lfirst2.get(i))){
                    System.out.println("Not Anagram");
                    break;
                }
                else{
                    counter++;
                }
            }
        }else{
            System.out.println("Not anagram...");
        }

        if(counter == lfirst1.size()){
            System.out.println("Is Anagram");
        }


    }
    }




