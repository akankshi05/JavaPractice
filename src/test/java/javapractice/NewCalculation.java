package javapractice;

public class NewCalculation {


    int sum(int x, int y){

        int a = x+y;
        return a;
    }
    int sum(int x, int y, int z){

        int b = x+y+z;
        return b;

    }
    double sum(double x, double y){
         double c=x+y;
        return c;
    }

    double sum(double x, double y,double z){
        return x+y+z;
    }

    public static void main(String args[]){

        NewCalculation nc = new NewCalculation();
        System.out.println(nc.sum(2,3));
        System.out.println(nc.sum(1,2,3));
        System.out.println(nc.sum(1.2,3.4));
        System.out.println(nc.sum(1.1,2.5,3.7));
    }

}
