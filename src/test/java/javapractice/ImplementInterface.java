package javapractice;

interface A{
    int a=20;
    int b=30;
    int sum();
}
public class ImplementInterface implements A {

    public int sum()
    {


        return a+b;

    }

    public static void main(String[] args){
        ImplementInterface i = new ImplementInterface();

        System.out.println(i.sum());
    }
}
