package javapractice;

public class FindWordWithMaxCharactersInASentence {


    public  static void main(String[] args){
        String sentence = "Validating the code written by Akankshiji";
        String[] word = sentence.split(" ");
        int y=0;
        String s = "";
        for(String i:word) {
            int z = i.length();
            if(z>y)
            {
                y=z;
                s=i;
            }

            System.out.println("Word " + i + " has length "+ z);
            
        }
        System.out.println("longest word is "+s +" having length" + y);

    }
}
