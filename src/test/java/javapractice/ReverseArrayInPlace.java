package javapractice;

public class ReverseArrayInPlace {

    public static void main(String[] args){

        String[] arr = {"a","b","c"};
        String[] reverse= new String[arr.length];

        for(int i =0; i< arr.length; i++){


                reverse[(arr.length-1)-i] =arr[i];

        }

        for(String x: reverse)
        System.out.print(x);

    }
}
