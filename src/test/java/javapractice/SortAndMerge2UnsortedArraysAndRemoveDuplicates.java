package javapractice;

import java.util.*;

public class SortAndMerge2UnsortedArraysAndRemoveDuplicates {
// a b c  // c d e
    public static void main(String[] args){

        String[] arr1 = {"c","b","a"};
        String[] arr2 = {"d","c","e"};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));

        /* using Collections
        Set l1 = new HashSet();

        System.out.print(Arrays.toString(arr1));

        System.out.print(Arrays.toString(arr2));
        System.out.println();

        l1.addAll(Arrays.asList(arr1));
        l1.addAll(Arrays.asList(arr2));

      for(Object i:l1){

          System.out.println(i);
      } */

        String[] arr3 = new String[arr1.length+ arr2.length];

        for(int i=0; i<arr1.length;i++){
            arr3[i]= arr1[i];
        }

        for(int i=0;i<arr2.length;i++){  //arr2  c d e
            for(int j=0; j<arr1.length;j++){//arr1  a b c
                if(!arr1[j].equals(arr2[i])) {
                    if (!arr1[j].equals(arr2[i]) && j == arr1.length - 1) {
                        arr3[arr1.length + i] = arr2[i];
                    }
                }
                    else if (arr1[j].equals(arr2[i])) {
                        break;
                    }
                }
            }

        int count=0;

        for(String s:arr3) {
            if (s != null) {
                count++;
            }
        }
            String[] finalarray= new String[count];

            int b=0;
            System.out.println();
            for(int z=0;z<arr3.length;z++){
                if(arr3[z]!=null){
                    finalarray[b]=arr3[z];
                    b++;
                }
            }

            for(String a:finalarray){
                System.out.println(a);
            }
        }

    }

