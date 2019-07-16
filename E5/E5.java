import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
class E5 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] tab=new int[1037];
        File file=new File("input.txt");
        Scanner reader=new Scanner(file);

        for(int i=0;i<1037;i++) {
            tab[i]=reader.nextInt();
        }
        int j=0, k=0, temp=0;
        while (j>=0 && j<1037) {
            temp=j;
            j=j+tab[j];
            if (tab[temp]>=3){
                tab[temp]--;
            }
            else {
                tab[temp]++;
            }
            k++;
        }
        System.out.println("Wykonano krokow: " +k);


    }
}
