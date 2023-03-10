package practice_String;

public class String_practice {
    public static void main(String[] args) {
        String firstName = "Hello my name is Melda";
        System.out.println(firstName.length());

        int fn = firstName.indexOf("name",4);//start searching name after index 4
        System.out.println(fn);

        //skip first 2 letters
        System.out.println(firstName.substring(2));

        String str = "Hello yogi there yogi there";
        int a = str.indexOf("yogi");//search left to right
        System.out.println(a);//answer is 6
        int b =str.lastIndexOf("yogi");
        System.out.println(b);
    }
}