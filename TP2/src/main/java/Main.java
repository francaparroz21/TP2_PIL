public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Number,Serial,Dog> map = new EpicDoubleHashMap<>();
        Serial serial1 = new Serial("123");
        Serial serial2 = new Serial("1ASDUOHASDU44444446278");
        Serial serial3 = new Serial("111111ASDUOHASDUA6278");
        Serial serial4 = new Serial("123");



        Dog d1 = new Dog("a",1);
        Dog d2 = new Dog("aasd",1);
        Dog d3 = new Dog("a",1);
        Dog d4 = new Dog("a",1);





        try {
            map.addSecond(13,d1);
            map.addSecond(3,d1);
            System.out.println(map.repeatedValues());

            System.out.println(map.countSameValues(13));
            System.out.println(map.repeatedValues());


            System.out.println(map.countSameValues(13));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
