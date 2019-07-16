import java.util.*;
public class Passer {

    boolean isvalid(String line){
        Scanner reader=new Scanner(line);

        boolean p=true;
        String[] tab=new String[11];
        int i=0;
        while (reader.hasNext()) {
            tab[i]=reader.next();
            i++;
        }
        for(int j=0;j<11;j++) {
            for(int k=0;k<11;k++) {
                if(j!=k && tab[j]!=null && tab[j].equals(tab[k])) p=false;
            }
        }
        //System.out.println(Arrays.toString(tab));
        //System.out.println(p);
        return p;
    }
}
