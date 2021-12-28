package javapractice;

public class fibonnacii {

    public static void main(String[] args){

        int i=1; int k=1; int z=0;

        System.out.println(i);
        System.out.println(k);

        for(int j=1; j<10;j++){
               z=i+k;
            System.out.println(z);
               i=k;
               k=z;
        }
    }

}
