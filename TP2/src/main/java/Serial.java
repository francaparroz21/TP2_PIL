public class Serial {
    private long num;
    public Serial(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

    @Override
    public String toString() {
        return Long.toString(getNum());
    }

}
