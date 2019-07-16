import java.util.*;
public class Passerv2 {

    boolean isvalid(String line){
        Scanner reader=new Scanner(line);

        boolean p=true;
        String[] tab=new String[11];

        int i=0;
        while (reader.hasNext()) {
            tab[i]=reader.next();
            i++;
        }
        char[][] charTab=new char[11][10];
        for (int z=0;z<11;z++) {
                if (tab[z]!=null) charTab[z]=tab[z].toCharArray();
        }
        //System.out.println(Arrays.deepToString(charTab));
        Comparator comp=new Comparator();

        for(int j=0;j<11;j++) {

            for (int k=0;k<11;k++) {
                if (charTab[j][0]!=(char)0 && charTab[k][0]!=(char)0 && k!=j) {
                    //System.out.println("1. warunek");
                    if (comp.isanagram(charTab[j], charTab[k])) {
                        //System.out.println("2. warunek");
                        p=false;

                    }
                }
            }
        }
        return p;
    }

}
