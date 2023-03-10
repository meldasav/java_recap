package java_basics;

public class LearningArrays {
    public static void main(String[] args) {

        int[] values = new int[100];
        values[0]= 1000;//first index
        values[99]=93432;//last index
        System.out.println(values[1]);// answer is 0

        String[] words = new String[] {"My","name","is"};
        System.out.println(words[2]);//answer is = is

        String[] fullName = new String[2];
        fullName[0]="Melda";
        fullName[1]="Sav";
        System.out.println(fullName[0]);

        fullName= new String[3];
        fullName[0]="Melda";
        fullName[1]="Sav";
        fullName[2]="GulSever";
        System.out.println(fullName[2]);
    }
}
