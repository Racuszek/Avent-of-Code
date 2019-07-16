import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class E7v4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input3.txt");
        Scanner reader=new Scanner(file);
        ArrayList<ArrayList<String>> tab=new ArrayList<ArrayList<String>>();

        for (int i=0;i<1422;i++) {
            if (reader.hasNext()) {
                String line=reader.nextLine();
                Scanner liner=new Scanner(line);
                ArrayList<String> list=new ArrayList<>();
                while (liner.hasNext()) {
                    list.add(liner.next());
                }
                tab.add(list);
            }
            //System.out.println(tab.get(i)); To działa!
        }
        System.out.println(tab.get(1).get(1));
    }
}