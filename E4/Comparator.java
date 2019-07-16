import java.util.Arrays;
class Comparator {
    public boolean isanagram(char[] tab1, char[] tab2) {
        boolean p=true;
        if(tab1.length!=tab2.length) return false;
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        for(int i=0;i<tab1.length;i++){
            if (tab1[i]!=tab2[i]) p=false;
        }
        /*
        if (p) {
            System.out.println(Arrays.toString(tab1));
            System.out.println(Arrays.toString(tab2));
            System.out.println("To anagram");
        }
        else {
            System.out.println(Arrays.toString(tab1));
            System.out.println(Arrays.toString(tab2));
            System.out.println("To nie anagram");
        }
        */
        return p;
    }
}
