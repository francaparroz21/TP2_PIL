import java.util.HashMap;
import java.util.Map;

class EpicDoubleHashMap<K extends Number,V,T> {

    //TWO HASHMAPS
    HashMap<K,V> list1;
    HashMap<K,T> list2;

    //CONSTRUCTOR
    public EpicDoubleHashMap(){
        this.list1 = new HashMap<K,V>();
        this.list2 = new HashMap<K,T>();
    }

    //V,T GETTERS.
    public V getFirst(K key) throws InexistentValue{
        if (list1.get(key)==null){
            throw new InexistentValue();
        }
        return list1.get(key);
    }

    public T getSecond(K key) throws InexistentValue{
        if (list2.get(key)==null){
            throw new InexistentValue();
        }
        return list2.get(key);
    }

    //Adds
    public void addFirst(K key,V value) throws KeyAlreadyExists,ThreeSameValues {
        if (threeSameValuesV(value)){
            throw new ThreeSameValues();
        }
        if (list1.containsKey(key)) {
            throw new KeyAlreadyExists();
        }
        list1.put(key,value);
    }

    public void addSecond(K key,T value)throws KeyAlreadyExists,ThreeSameValues{
        if (threeSameValuesT(value)){
            throw new ThreeSameValues();
        }
        if (list2.containsKey(key)){
            throw new KeyAlreadyExists();
        }
        list2.put(key,value);
    }

    public void addTwo(K key, V value, T value2) throws KeyAlreadyExists,ThreeSameValues {
        if (list1.containsKey(key)||list2.containsKey(key)){
            throw new KeyAlreadyExists();
        }
        addFirst(key,value);
        addSecond(key,value2);
    }

    //Remove item
    public void removeItem(K key) throws InexistentKey {
        if (list1.containsKey(key)) {
            list1.remove(key);
        }
        if (list2.containsKey(key)) {
            list2.remove(key);
        } else {
            throw new InexistentKey();
        }
    }

    //Function for ThreeSameValues Exceptions

    public boolean threeSameValuesV(V value){
        int count = 0;
        for (Map.Entry<K,V >entry : list1.entrySet()) {
            if (value.equals(entry.getValue())){
                count +=1;
            }
        }
        return count >= 3;
    }

    public boolean threeSameValuesT(T value){
        int count = 0;
        for (Map.Entry<K,T>entry : list2.entrySet()) {
            if (value.equals(entry.getValue())){
                count +=1;
            }
        }
        return count >= 3;
    }

    //Auxiliars Methods
    public void countValues(){
        if (list1.size()>list2.size()){
            System.out.println("There are more V values than T");
        } else if (list2.size()>list1.size()) {
            System.out.println("There are more T values than V");
        }
        else {
            System.out.println("There are the same amount of values");
        }
    }

    public int countSameValues(K key){
        if (!list1.containsKey(key) && !list2.containsKey(key)) return 0;

        V valueV = list1.getOrDefault(key, null);
        T valueT = list2.getOrDefault(key, null);

        int count = 0;

         if (valueV != null && valueT == null) {
             for (Map.Entry<K,V>entry1 : list1.entrySet()) {
                 if (!key.equals(entry1.getKey())&&valueV.equals(entry1.getValue()))count++;
             }
        }
        if (valueT != null && valueV == null) {
            for (Map.Entry<K,T>entry2 : list2.entrySet()) {
                if (!key.equals(entry2.getKey())&&valueV.equals(entry2.getValue()))count++;
            }
        }

        if (valueV != null && valueT != null){
            for (Map.Entry<K,V>entry1 : list1.entrySet()) {
                for (Map.Entry<K,T>entry2 : list2.entrySet()){
                    if (!key.equals(entry1.getKey())&&entry1.getKey().equals(entry2.getKey())){
                        if (valueV.equals(entry1.getValue()) && valueT.equals(entry2.getValue())) count++;
                     }
                 }
            }
        }
        return count;
    }


    public boolean repeatedValues(){
        for (K keyIterator: list1.keySet()) {
            if (countSameValues(keyIterator)>1){
                return true;
            }
        }
        for (K keyIterator: list2.keySet()) {
            if (countSameValues(keyIterator)>1){
                return true;
            }
        }
        return false;
    }
}





