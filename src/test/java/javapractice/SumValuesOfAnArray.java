package javapractice;

public class SumValuesOfAnArray {

    public static void main (String args []){

        int i[]={100, 200, 300};
        int z=0;


        for(int a=0 ; a<i.length ;a++){

            z= i[a]+z ;

        }

        System.out.println((  z ));
    }
}
