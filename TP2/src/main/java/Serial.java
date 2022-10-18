
public class Serial {
    private String num;
    public Serial(String num) {
        this.num = num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    @Override
    public String toString() {
        return getNum();
    }

    public boolean equals(Serial s){
        return getNum().equals(s.getNum());
    }

}
