package javapractice;


import java.util.*;
import java.util.stream.Stream;

public class pangrim {

    public static void main(String[] args) {
//
//        HashSet<String> hs = new HashSet<String>();
//        String test = "abcdefgh ijklmn opqrstuv wxyghihiod sdfksd";
//        HashSet<String> hs2 = new HashSet<String>();
//        hs2.add("a");
//        hs2.add("b");
//        hs2.add("c");
//        hs2.add("d");
//        hs2.add("e");
//        hs2.add("f");
//        hs2.add("g");
//        hs2.add("h");
//        hs2.add("i");
//        hs2.add("j");
//        hs2.add("k");
//        hs2.add("l");
//        hs2.add("m");
//        hs2.add("n");
//        hs2.add("o");
//        hs2.add("p");
//        hs2.add("q");
//        hs2.add("r");
//        hs2.add("s");
//        hs2.add("t");
//        hs2.add("u");
//        hs2.add("v");
//        hs2.add("w");
//        hs2.add("x");
//        hs2.add("y");
//        hs2.add("z");
//
//
//        String[] letter = test.split("");
//        for (String i : letter) {
//            hs.add(i);
//
//        }
//
//        System.out.println(hs);
//        System.out.println(hs2);
//
//        if (hs.containsAll(hs2)) {
//            System.out.println("Is a Pangram");
//        } else {
//            System.out.println("not a pangram");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");

        String pangram = sc.nextLine();
        System.out.println("The entered value is: "+pangram);

       // String pangram = "the quick brown fox jumps over a lazy dog";
        String[] split = pangram.split("");
        List al3 = new ArrayList(Arrays.asList(split));
        String[] a = {"a","b","c","d","e","f","g","h","i","j","h",
                      "i","j","k","l","m","n","o","p","q","r","s",
                      "t","u","v","w","x","y","z"};


        List al = new ArrayList(Arrays.asList(a));
//        List al2 = new ArrayList();
//
//        for(String i:split){
//            al2.add(i);
//        }
//        System.out.println(al);
//        System.out.println(al2);

        if(al3.containsAll(al)) {
            System.out.println("Is a Pangram");
        }
        else{
            System.out.println("not a pangram");

        }
    }

}
