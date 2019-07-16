import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeMap;
class E7v3 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<String, Integer> map=new TreeMap<>();
        File file=new File("input3.txt");
        Scanner reader=new Scanner(file);
        String[] tab=new String[1422];

        for (int i=0;i<1422;i++) {
            if (reader.hasNext()) {
                tab[i]=reader.nextLine();

                Scanner liner=new Scanner(tab[i]);
                if (liner.hasNext()) {
                    map.put(liner.next(), (Integer)liner.nextInt());
                }
            }
        }

        //System.out.println("Liczba zmapowanych elementow: " +map.size());
        //System.out.println(map.containsValue(0));
        /*for(int i=0;i<1422;i++) {
            Scanner analyser=new Scanner(tab[i]);
            analyser.next();
            analyser.nextInt();
            while(analyser.hasNext()) {
                a=map.get(analyser.next());
                if (analyser.hasNext() && map.get(analyser.next())!=a) {
                    System.out.println("Blad w linijce " +i);
                    break;
                }
            }      
        }*/


    }
    boolean isbalanced(String disc, String[] tab, TreeMap<String, Integer> map) {
        boolean p=true;
        int[] a=new int[6], k=0;
        for (int i=0;i<1422;i++) {
            Scanner filer=new Scanner(tab[i]);
            if (filer.next().equals(disc)) {
                filer.nextInt();
                while(filer.hasNext()) {
                    a[k]=filer.nextInt();
                    k++;
                }

            }
        }
        return p;
    }

}
