public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Number,Object,Object> map = new EpicDoubleHashMap<>();
        Serial serial = new Serial("1ASDUOHASDUA6278");
        Serial serial2 = new Serial("1ASDUOHASDUA6278");
        System.out.println("asd" +serial.equals(serial2));

        Dog d1 = new Dog("firulais",30);
        Dog d2 = new Dog("firulais",30);

        System.out.println("asd" +d1.equals(d2));



        try {
            //---------
            map.addFirst(13, "HOLAPALERMO");
            map.addSecond(13, serial);
            map.removeItem(13);
            map.addSecond(13, "HGOLALADSDASDASD");
            map.removeItem(13);
            map.addFirst(13,1238124);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
