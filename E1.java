import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class E1{
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner odczyt=new Scanner(file);
        int a=0, b=0, k=0;
        a=odczyt.nextInt();
        for (int i=0;i<2097;i++) {
            b=odczyt.nextInt();
            System.out.println(a);
            System.out.println(b);
            System.out.println();
            if (a==b){
                    k=k+a;
                    System.out.println(k);
                    System.out.println();
            }
            a=b;
        }
        System.out.println(k+5);

    }
}
