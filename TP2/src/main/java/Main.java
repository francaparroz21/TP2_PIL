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
            map.addSecond(1283,"chau");
            map.addSecond(191919,"chau");
            map.addTwo(3,"asdasd","hola");
            map.addFirst(10,d1);
            map.addFirst(1,d2);
            map.addFirst(101010,d1);
            map.countValues();
            System.out.println("asdasd");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
