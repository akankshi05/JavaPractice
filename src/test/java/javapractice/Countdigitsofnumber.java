package javapractice;

public class Countdigitsofnumber {

    public static void main(String args[]) {



//        if (x / 10 < 1) {
//            System.out.println("1");
//        } else if ( x / 10 < 10 ) {
//            System.out.println("2");
//        } else if ( x / 10 < 100) {
//            System.out.println("3");
//        } else if ( x / 10 < 1000) {
//            System.out.println("4");
//        }
//        else if ( x / 10 < 10000) {
//            System.out.println("5");
//        }

        int x = 255457449;
        int y =1;
        int z=1;

        while (true)
        {
            if ((x/10)<y) {
                System.out.println("The number of digits is " + z);
                break;
            }
            z++;
            y = y*10;
        }

    }
}
