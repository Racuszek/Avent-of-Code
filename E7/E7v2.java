import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
class E7v2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input3.txt");
        Scanner reader=new Scanner(file);
        String[] tab=new String[1422];
        String[] names=new String[1422];
        int[] weights=new int[1422];
        String[] samplenames=new String[7];
        int[] sampleweights=new int[7];
        String propern;
        int border=0;


        for (int i=0;i<1422;i++) {
            if (reader.hasNext()) {
                tab[i]=reader.nextLine();

                Scanner liner=new Scanner(tab[i]);
                if (liner.hasNext()) names[i]=liner.next();
                if (liner.hasNext()) weights[i]=liner.nextInt();
            }
            System.out.println(names[i] + " " + weights[i]);
        }
        for(int i=0;i<1422;i++) {
            Scanner analyser=new Scanner(tab[i]);
            if(analyser.hasNext()) propern=analyser.next();

        }


    }
}
