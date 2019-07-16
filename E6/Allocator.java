class Allocator {
    void alloc(int[] tab) {
        int max=0, ind=0;
        for(int j=0;j<16;j++) {
           if (tab[j]>max) {
               max=tab[j];
               ind=j;
           }
        }
        tab[ind]=0;
        for(int j=max;j>0;j--) {
            if (ind==15) {
                ind=-1;
            }
            tab[ind+1]=tab[ind+1]+1;
            ind++;
        }

    }
}
