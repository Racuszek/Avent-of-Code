import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class E1v2{
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner odczyt=new Scanner(file);
        int a=0, b=0, k=0;
        int[] tab=new int[4196];

        for (int i=0;i<2098;i++) {
            tab[i]=odczyt.nextInt();
            tab[i+2098]=tab[i];
        }
        for(int i=0;i<2098;i++) {
            if (tab[i]==tab[i+1049]) k=k+tab[i];
        }
        System.out.println(k);

    }
}
