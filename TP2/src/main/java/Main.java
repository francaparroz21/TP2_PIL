public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Number,Serial,Dog> map = new EpicDoubleHashMap<>();
        Serial serial = new Serial("1ASDUOHASDUA6278");
        Serial serial2 = new Serial("1ASDUOHASDUA6278");

        Dog d1 = new Dog("firulais",30);
        Dog d2 = new Dog("firulais",30);




        try {
            map.addTwo(13,serial,d1);
            map.addTwo(3,serial,d1);
            map.addTwo(5,serial,d1);

            System.out.println(map.contarMismosValores(13));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
