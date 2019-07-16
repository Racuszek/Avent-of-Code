import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class E7 {
    public static void main(String[] args) throws FileNotFoundException {
        int n=2843;
        boolean p=false;
        File file=new File("input2.txt");
        Scanner odczyt=new Scanner(file);
        String[] tab=new String[2843];
        for (int i=0;i<n;i++) {
            //System.out.println(tab[i]);
            tab[i]=odczyt.next();
        }
        for(int i=0;i<n;i++) {
            p=false;
            for (int j=0;j<n;j++) {
                if (tab[i].equals(tab[j]) && i!=j) p=true;
            }
            if (!p) {
                System.out.println("Nie powtarza sie dysk " +tab[i]);
                break;
            }
        }


    }
}
