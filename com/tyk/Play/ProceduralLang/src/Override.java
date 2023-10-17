public class Override {
    private int x;
    private int y;
    public Override(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @java.lang.Override
    public boolean equals(Object obj) {
        if (obj instanceof Override) {
            Override o = (Override) obj;
            return this.x == o.x && this.y == o.y;
        }
        return false;
    }
}
