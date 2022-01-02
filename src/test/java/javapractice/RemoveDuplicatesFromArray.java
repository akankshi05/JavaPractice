package javapractice;

import java.util.Objects;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputarray = input.split("");
        StringBuilder outputarray = new StringBuilder();


        for (int x =0; x<inputarray.length;x++){
            for(int y=x+1;y<inputarray.length;y++ ){
                if(!inputarray[x].equals(inputarray[y]) )
                {
                    if(y == inputarray.length -1 ){
                        outputarray.append(inputarray[x]);
                    }
                }
                else if(inputarray[x].equals(inputarray[y]) && y == inputarray.length -1 ){
                    outputarray.append(inputarray[x]);

                }
                else if(inputarray[x].equals(inputarray[y]) && y != inputarray.length -1){
                    break;
                }

            }
        }
        System.out.println(outputarray);
    }
}
