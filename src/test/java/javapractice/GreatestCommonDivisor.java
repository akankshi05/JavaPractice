package javapractice;

import java.util.*;

// 24, 28     24=24*1 ,12*2, 8*3,6*4 ,      28= 2*14 , 4*7 ,
public class GreatestCommonDivisor {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers for checking GCD");
//        String input =sc.next();
//        String[] inputnumbers = (input.split(""));

          int[] arr = {98,91,36};
          int GCD =0;
        int counter =0;

        List<Integer> l1 = new ArrayList<Integer>();
          for(int i=0; i<arr.length ; i++){

              for(int j=1; j<arr[i] ; j++){

                  if(arr[i] % j == 0){
                      l1.add(j);}
                  }

              }
             System.out.println(l1);

          for(int y=0; y<l1.size();y++){
              for(int z=1; z<l1.size();z++){
                  if(l1.get(y) == l1.get(z)){
                      counter++;
                  }

                  }
              if(counter == arr.length && l1.get(y)>GCD){
                  GCD=l1.get(y);
              }
              else if(counter == arr.length && l1.get(y)<GCD){
                  GCD = GCD;
              }
               counter=0;
          }
        System.out.println(GCD);
          }

    }
