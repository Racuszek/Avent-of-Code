import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.TreeMap;
class E7v5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("input3.txt");
        Scanner reader=new Scanner(file);
        TreeMap<String, ArrayList<String>> map=new TreeMap<>();

        for (int i=0;i<1422;i++) {
            if (reader.hasNext()) {
                String line=reader.nextLine();
                Scanner liner=new Scanner(line);
                ArrayList<String> list=new ArrayList<>();
                String name=liner.next();
                list.add(liner.next());
                while (liner.hasNext()) {
                    list.add(liner.next());
                }
                map.put(name, list);
            }
            
        }
        String str=null;
        int maxGen=0;
        for (String disc1 : map.keySet()) {
            if (isFinal(map, disc1)) {
                for (String disc2 : map.keySet()) {
                    
                        if (getParent(map, disc1).equals(getParent(map, disc2))) {
                            if(getW(map, disc1)!=getW(map, disc2)) {
                                System.out.println("Found: "+disc1+", "+disc2);
                                if (getGen(map, disc1)>maxGen) {
                                    maxGen=getGen(map, disc1);
                                    str=disc1;
                                }
                                break;
                            }
                        }
                    
                }
                System.out.println("Computing ended for "+disc1);
            }
            System.out.println();
        }
        
        System.out.println(maxGen+", dysk "+str);
        
        
    }

    static int getWeightOfChildren(TreeMap<String, ArrayList<String>> map, String disc) {
        int sum=0;
        for (String subdisc : subDiscs(map, disc)) {
            sum+=getW(map, subdisc);
        }
        return sum;
    }


    static String getParent(TreeMap<String, ArrayList<String>> map, String disc) {

        for(String potentialParent : map.keySet()) {
            for(int i=1;i<numberOfDiscs(map, potentialParent)+1;i++) {
                if (getComponent(map, potentialParent, i).equals(disc)) return potentialParent;
            }
        }
        return "No parent found";
    }
    static ArrayList<String> subDiscs(TreeMap<String, ArrayList<String>> map, String disc) {
        map.get(disc).remove(0);
        return map.get(disc);
    }
    static int getGen(TreeMap<String, ArrayList<String>> map, String disc) {
        if (disc.equals("eugwuhl")) return 0;
        String ancestor=disc;
        int k=1;
        while (getParent(map, ancestor).equals("eugwuhl")==false) {
            ancestor=getParent(map, ancestor);
            k++;
        }
        return k;
    }

    static int numberOfDiscs(TreeMap<String, ArrayList<String>> map1, String disc) {
        return map1.get(disc).size()-1;
    }

    static int getW(TreeMap<String, ArrayList<String>> map, String disc) {
        return Integer.parseInt(map.get(disc).get(0));
    }

    static String getComponent(TreeMap<String, ArrayList<String>> map, String disc, int index) {
        if (index>numberOfDiscs(map, disc)) return "invalid index";
        return map.get(disc).get(index);
    }

    static boolean isFinal(TreeMap<String, ArrayList<String>> map, String disc) {
        if (numberOfDiscs(map, disc)==0) return true;
        else return false;
    }

    static int isBalanced(TreeMap<String, ArrayList<String>> map, String disc) {
        //Returns index of wrong-weighted subdisc. Returns -1 if dics is balanced, returns -2
        //if disc is unbalanced, but has two subdiscs only, returns -3 if it's a top disc.
        //Returns -10 if something went completely wrong in an unplanned way.
        if (numberOfDiscs(map, disc)==1) return -1;
        if (numberOfDiscs(map, disc)==0) return -3;
        ArrayList<Integer> weights=new ArrayList<>();
        for(int i=1;i<numberOfDiscs(map, disc)+1;i++) {
            weights.add(getW(map, getComponent(map, disc, i)));
        }
        if (numberOfDiscs(map, disc)==2 && weights.get(0)!=weights.get(1)) return -2;
        int min=weights.get(0), max=weights.get(0);
        for(int i=0;i<weights.size();i++) {
            if (weights.get(i)<min) min=weights.get(i);
            if (weights.get(i)>max) max=weights.get(i);
        }
        if (min==max) return -1;
        if (weights.get(0)!=weights.get(weights.size()-1)) {
            if (weights.get(0)==weights.get(1)) return weights.size()-1;
            else return 0;
        }
        for (int i=1;i<weights.size();i++) {
            if (weights.get(i)!=weights.get(0)) return i;
        }
        return -10;


    }
}