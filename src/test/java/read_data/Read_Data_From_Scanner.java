package read_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Data_From_Scanner {
    public static void main(String[] args) {

        try {
            File file = new File("myFile.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
          //  e.printStackTrace();
        }

        MyFileUtils myFileUtils = new MyFileUtils();
        try {
            System.out.println(myFileUtils.subtract10FromLargeNumber(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}