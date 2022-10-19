public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Number,Object,Object> map = new EpicDoubleHashMap<>();
        Serial serial = new Serial("1ASDUOHASDUA6278");
        Serial serial2 = new Serial("1ASDUOHASDUA6278");

        Dog d1 = new Dog("firulais",30);
        Dog d2 = new Dog("firulais",30);




        try {
            map.addFirst(13,"hola");
            map.addSecond(45,"hola");
            System.out.println(map.repeatedValues());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
