package practice_loops;

public class Practice_Fori_loop {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if(i%2==0) System.out.print(i+"-");
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100; i=i+2) {
            sb.append(i).append("-");
        }
        System.out.print(sb.substring(0,sb.length()-2));

        int count = 0;
        for (int i = 0; i <=100; i++) {
            System.out.println(i);
            int temp = count +1;
            count = temp;
        }

        for (int i = 0; i <100 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
