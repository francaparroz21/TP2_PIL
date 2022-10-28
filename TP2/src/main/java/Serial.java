
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
        return "Num: "+getNum();
    }

    @Override
    public boolean equals(Object o){
        Serial serial = (Serial) o;
        return num.equals(serial.num);
    }

}
