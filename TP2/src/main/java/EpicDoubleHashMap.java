import java.util.HashMap;

class EpicDoubleHashMap<K extends Number,V,T> {
    HashMap<K,V> list1;
    HashMap<K,T> list2;

    public void addFirst(K key,V value){
        list1.put(key,value);
    }
    public void addSecond(K key,T value){
        list2.put(key,value);
    }
    public void addTwo(K key, V value, T value2){
        list1.put(key,value);
        list2.put(key,value2);
    }

    public void getFirst(K key){
        list1.get(key);
    }
    public void getSecond(K key){
        list2.get(key);
    }

    public void removeItem(K key){
        if (list1.containsKey(key)){
            list1.remove(key);
        }
        if (list2.containsKey(key)){
            list2.remove(key);
        }
    }










}
