import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
class E6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input.txt");
        Scanner reader=new Scanner(file);
        int n=10000;
        int[][] tab=new int[n][16];
        int i=0;
        while (reader.hasNext()) {
            tab[0][i]=reader.nextInt();
            i++;
        }
        int p=0, first=0, second=0;
        Allocator al=new Allocator();
        int[] loop={0, 14, 13, 12, 11, 10, 8, 8, 6, 6, 5, 3, 3, 2, 1, 10};
        for (int l=0;l<n-1;l++) {
            for(int k=0;k<16;k++) {
                tab[l+1][k]=tab[l][k];
            }
            al.alloc(tab[l+1]);
            if (Arrays.equals(tab[l+1], loop)) {
                p++;
                if (p==1) {
                    first=l+1;
                }
                if (p==2) {
                    second=l+1;
                    System.out.println("Loop size is " +(second-first));
                }
            }

            /*
            for (int m=0;m<l+1;m++) {
                if (Arrays.equals(tab[m], tab[l+1])) {
                    System.out.println("Infinite loop detected in run nr " +(l+1));
                    System.out.println("The configuration is: "+Arrays.toString(tab[l+1]));
                    System.exit(0);
                }
            }
            */
        }



    }
}
