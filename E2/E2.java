import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
public class E2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner odczyt=new Scanner(file);
        int[][] tab=new int[16][16];
        for(int i=0;i<16;i++) {
                for (int j=0;j<16;j++) {
                    tab[i][j]=odczyt.nextInt();
                }
        }
        int k=0;
        for(int i=0;i<16;i++) {
            int min=tab[i][0];
            int max=min;
            for (int j=1;j<16;j++) {
                if (tab[i][j]<min) min=tab[i][j];
                if (tab[i][j]>max) max=tab[i][j];
            }
            k=k+(max-min);
        }
        System.out.println(k);
        System.out.println(toString(tab));
        String toString() {
            String ans;
            ans=Arrays.toString(tab[0])+"\n"+Arrays.toString(tab[1])+"\n"+Arrays.toString(tab[2]);
            return ans;
        }
    }
}
