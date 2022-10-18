public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Number,Object,Object> map = new EpicDoubleHashMap<>();
        Serial serial = new Serial(1238616278);

        try {
            //---------
            map.addFirst(13, "HOLAPALERMO");
            map.addSecond(13, serial);
            map.removeItem(13);
            map.addSecond(13, "HGOLALADSDASDASD");
            map.removeItem(13);
            map.addFirst(13,1238124);
            System.out.println(map.getTwo(13));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
