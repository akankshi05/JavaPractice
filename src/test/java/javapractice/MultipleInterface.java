package javapractice;

interface C{
        int a=10;
        int b=20;
        void sum();


        };
interface B{
        int c=20;
        int d=30;
        void multiply();
};
public class MultipleInterface implements B,C{


        @Override
        public void sum() {
                System.out.println(a+b);

        }

        @Override
        public void multiply() {
                System.out.println(c*d);

        }


        public static void main(String[] args){

                MultipleInterface M=new MultipleInterface();
                M.multiply();
                M.sum();
        }

}
