import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class E8 {
    public static void main (String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner reader=new Scanner(file);
        String templine;
        String[] splitline;
        //List<String> names=new ArrayList<>();
        while(reader.hasNext()) {
            templine=reader.nextLine();
            splitline=templine.split(" ");

            Scanner linereader=new Scanner(templine);

        }
    }
}
