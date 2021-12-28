package javapractice;

public class Calculation {

    int var1;
    int var2;
    int var3;

    Calculation(int x, int y, int z){
        var1=x;
        var2=y;
        var3=z;

    }
    int Sum(){
        int s;
        s=var1+var2+var3;
        return s;
    }

    public static void main(String args[]){
        Calculation cal = new Calculation(2,3,6);
        System.out.println(cal.Sum());

    }
}
