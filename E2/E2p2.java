import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
public class E2p2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner odczyt=new Scanner(file);
        int y=0;
        int[][] tab=new int[16][16];
        for(int i=0;i<16;i++) {
                for (int j=0;j<16;j++) {
                    tab[i][j]=odczyt.nextInt();
                }
        }
        int k=0;
        for(int i=0;i<16;i++) {
            for(int j=0;j<16;j++) {
                for(int z=0;z<16;z++) {
                    if(tab[i][j]>tab[i][z] && tab[i][j]%tab[i][z]==0) y=y+(tab[i][j]/tab[i][z]);
                }
            }

        }
        System.out.println(y);

    }
}
