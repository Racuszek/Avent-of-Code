class Pair {
    private String name;
    private int weight;
    Pair(String n, int w) {
        name=n;
        weight=w;
    }
    void setn(String n2) {
        name=n2;
    }
    void setw(int w2) {
        weight=w2;
    }
    int getw() {
        return weight;
    }
    String getn() {
        return name;
    }
}
