import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
public class E4v2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner odczyt=new Scanner(file);
        Passerv2 pass=new Passerv2();

        int k=0, l=0;
        while (odczyt.hasNext()) {
        //for (int i=0;i<5;i++) {
                l++;
                if (pass.isvalid(odczyt.nextLine())) {
                        k++;
                        System.out.println("Haslo poprawne");
                }
                else {
                    System.out.println("Haslo niepoprawne");
                }
        }
        System.out.println(k +"/" +l);
        //System.out.println(Arrays.toString(charTab));

    }
}
