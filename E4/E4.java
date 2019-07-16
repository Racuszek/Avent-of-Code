import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
public class E4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner odczyt=new Scanner(file);
        Passer pass=new Passer();
        int k=0;
        while (odczyt.hasNext()) {
                if (pass.isvalid(odczyt.nextLine())) k++;

        }
        System.out.println(k);
    }
}
