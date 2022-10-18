import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class EpicDoubleHashMap<K extends Number,V,T> {
    HashMap<K,V> list1;
    HashMap<K,T> list2;

    public EpicDoubleHashMap(){
        this.list1 = new HashMap<K,V>();
        this.list2 = new HashMap<K,T>();
    }

    public void addFirst(K key,V value) throws KeyAlreadyExists {
        if (list1.containsKey(key)){
            throw new KeyAlreadyExists();
        }
        list1.put(key,value);
    }
    public void addSecond(K key,T value)throws KeyAlreadyExists{
        if (list2.containsKey(key)){
            throw new KeyAlreadyExists();
        }
        list2.put(key,value);
    }
    public void addTwo(K key, V value, T value2){
        list1.put(key,value);
        list2.put(key,value2);
    }


    //PREGUNTAR SI ACA VA EXEPCIONES
    public V getFirst(K key){
        return list1.get(key);
    }
    public T getSecond(K key){
        return list2.get(key);
    }

    //PREGUNTARLEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
    public String getTwo(K key){
       return getFirst(key).toString() + getSecond(key).toString();
    }
    //PREGUNTARLEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE

    public void removeItem(K key) throws InexistentKey{
        if (list1.containsKey(key)){
            list1.remove(key);
        }
        if (list2.containsKey(key)){
            list2.remove(key);
        }
        else {
            throw new InexistentKey();
        }
    }










}
