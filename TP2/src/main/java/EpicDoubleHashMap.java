import java.util.HashMap;
import java.util.Map;

class EpicDoubleHashMap<K extends Number,V,T> {
    HashMap<K,V> list1;
    HashMap<K,T> list2;

    public EpicDoubleHashMap(){
        this.list1 = new HashMap<K,V>();
        this.list2 = new HashMap<K,T>();
    }

    public void addFirst(K key,V value) throws KeyAlreadyExists,ThreeSameValues {
        if (threeSameValues(value)){
            throw new ThreeSameValues();
        }
        if (list1.containsKey(key)) {
            throw new KeyAlreadyExists();
        }
        list1.put(key,value);
    }

    public int countValuesKey(K key){
        int count = 0;

        if (list1.get(key) != null){
            for (Map.Entry<K, V> entry : list1.entrySet()) {
                if (list1.get(key).equals(entry.getValue())){
                    count+=1;
                }
            }
        }
        if (list2.get(key) != null){
            for (Map.Entry<K, T> entry : list2.entrySet()) {
                if (list2.get(key).equals(entry.getValue())){
                    count+=1;
                }
            }
        }
        return count;
    }


    //SIMPLIFICAAAAAAAAAAAAAAAAARR
    public boolean repeatedValues(){
        for (Map.Entry<K, V> access : list1.entrySet()) {
            for (Map.Entry<K, V> entry : list1.entrySet()) {
                if (!access.getKey().equals(entry.getKey())&&access.getValue().equals(entry.getValue())){
                    return true;
                }
            }
            for (Map.Entry<K, T> entry : list2.entrySet()) {
                if (!access.getKey().equals(entry.getKey())&&access.getValue().equals(entry.getValue())){
                    return true;
                }
            }
        }
        for (Map.Entry<K, T> access : list2.entrySet()) {
            for (Map.Entry<K, T> entry : list2.entrySet()) {
                if (!access.getKey().equals(entry.getKey())&&access.getValue().equals(entry.getValue())){
                    return true;
                }
            }
            for (Map.Entry<K, V> entry : list1.entrySet()) {
                if (!access.getKey().equals(entry.getKey())&&access.getValue().equals(entry.getValue())){
                    return true;
                }
            }
        }
        return false;
    }



    public void countValues(){
        int countV = 0,countT = 0;
        for (Map.Entry<K, V> entry : list1.entrySet()) {
            countV +=1;
        }
        for (Map.Entry<K, T> entry : list2.entrySet()) {
            countT += 1;
        }

        if (countV>countT){
            System.out.println("There are more V values than T");
        } else if (countT > countV) {
            System.out.println("There are more T values than V");
        }
        else {
            System.out.println("There are the same amount of values");
        }
    }

    public void addSecond(K key,T t)throws KeyAlreadyExists,ThreeSameValues{
        if (threeSameValues(t)){
            throw new ThreeSameValues();
        }
        if (list2.containsKey(key)){
            throw new KeyAlreadyExists();
        }
        list2.put(key,t);
    }
    public void addTwo(K key, V value, T value2) throws KeyAlreadyExists,ThreeSameValues {
        addFirst(key,value);
        addSecond(key,value2);
    }

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

    //PREGUNTAR SI VA CON OBJECT
    public boolean threeSameValues(Object value){
        int count = 0;
        for (Map.Entry<K, V> entry : list1.entrySet()) {
            if (value.equals(entry.getValue())){
                count +=1;
            }
        }
        for (Map.Entry<K, T> entry : list2.entrySet()) {
            if (value.equals(entry.getValue())) {
                count += 1;
            }
        }
        return count >= 3;
    }

    //PREGUNTARLEEEEEEEEEEEEEEEEEEEEEEEE  STRING   EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
    public String getTwo(K key) throws InexistentValue{
        return getFirst(key).toString() + getSecond(key).toString();
    }
    //PREGUNTARLEEEEEEEEEEEEEEEEEEEEEEEE  STRING   EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE

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



}
