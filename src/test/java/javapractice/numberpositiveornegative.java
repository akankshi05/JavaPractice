package javapractice;

import java.util.Scanner;

public class numberpositiveornegative {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] a = number.split("");
        int counter =0;
        for (int i=0;i<a.length;i++){
            if (a[i].equals("-")){
                System.out.println("no is -ve");
                counter =1;
                break;

            }


            }
          if(counter ==0){
              System.out.println("no is +ve");
          }
        }
    }

