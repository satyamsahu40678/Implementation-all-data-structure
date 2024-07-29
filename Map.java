import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// class HashMapExp{
//     HashMap<Integer, Integer> map = new HashMap<>();
//     public void put(int key, int val){
//         map.put(key, val);
//     }

//     public int get(int key){
//         return map.get(key);
//     }

//     public void remove(int key){
//         map.remove(key);
//     }

//     public boolean containsKey(int key){
//         return map.containsKey(key);
//     }

//     public boolean containsValue(int val){
//         return map.containsValue(val);
//     }

//     public int size(){
//         return map.size();
//     }
// }

//------------------------------------------------------------------------------------------------------------------------------------------------
// class LinkedHashMapExp{
//     LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//     public void put(int key, int val){
//         map.put(key, val);
//     }

//     public int get(int key){
//         return map.get(key);
//     }
//     public void remove(int key){
//         map.remove(key);
//     }
//     public boolean containsKey(int key){
//         return map.containsKey(key);
//     }
//     public boolean containsValue(int val){
//         return map.containsValue(val);
//     }
//     public int size(){
//         return map.size();
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------
// class TreeMapExp{
//     TreeMap<Integer, Integer> map = new TreeMap<>();
//     public void put(int key, int val){
//         map.put(key, val);
//     }

//     public int get(int key){
//         return map.get(key);
//     }
//     public void remove(int key){
//         map.remove(key);
//     }
//     public boolean containsKey(int key){
//         return map.containsKey(key);
//     }
//     public boolean containsValue(int val){
//         return map.containsValue(val);
//     }
//     public int size(){
//         return map.size();
//     }   
// }

//---------------------------------------------------------------------------------------------------------------------------------------------
// class ConcurrentHashMapExp{
//     ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
//     public void put(int key, int val){
//         map.put(key, val);
//     }

//     public int get(int key){
//         return map.get(key);
//     }
//     public void remove(int key){
//         map.remove(key);
//     }
//     public boolean containsKey(int key){
//         return map.containsKey(key);
//     }
//     public boolean containsValue(int val){
//         return map.containsValue(val);
//     }
//     public int size(){
//         return map.size();
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------------------

// class IdentityHashMapExp{
//     IdentityHashMap<Integer, Integer> map = new IdentityHashMap<>();
//     public void put(int key, int val){
//         map.put(key, val);
//     }

//     public int get(int key){
//         return map.get(key);
//     }
//     public void remove(int key){
//         map.remove(key);
//     }
//     public boolean containsKey(int key){
//         return map.containsKey(key);
//     }
//     public boolean containsValue(int val){
//         return map.containsValue(val);
//     }
//     public int size(){
//         return map.size();
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------------------
class WeakHashMapExp{
    WeakHashMap<Integer, Integer> map = new WeakHashMap<>();
    public void put(int key, int val){
        map.put(key, val);
    }

    public int get(int key){
        return map.get(key);
    }
    public void remove(int key){
        map.remove(key);
    }
    public boolean containsKey(int key){
        return map.containsKey(key);
    }
    public boolean containsValue(int val){
        return map.containsValue(val);
    }
    public int size(){
        return map.size();
    }
}

public class Map {
    public static void main(String[] args) {
        // HashMap hm = new HashMap();
        // hm.put(1, 10);
        // hm.put(2, 20);
        // hm.put(3, 30);
        // System.out.println(hm.get(1));
        // System.out.println(hm.get(2));
        // System.out.println(hm.get(3));
        // hm.remove(2);
        // System.out.println(hm.get(2));
        // System.out.println(hm.containsKey(2));
        // System.out.println(hm.containsValue(20));
        // System.out.println(hm.size());

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // LinkedHashMap hm = new LinkedHashMap();
        // hm.put(1, 10);
        // hm.put(2, 20);
        // hm.put(3, 30);
        // System.out.println(hm.get(1));
        // System.out.println(hm.get(2));
        // System.out.println(hm.get(3));
        // hm.remove(2);
        // System.out.println(hm.get(2));
        // System.out.println(hm.containsKey(2));
        // System.out.println(hm.containsValue(20));
        // System.out.println(hm.size());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // TreeMap hm = new TreeMap();
        // hm.put(1, 10);
        // hm.put(2, 20);
        // hm.put(3, 30);
        // System.out.println(hm.get(1));
        // System.out.println(hm.get(2));
        // System.out.println(hm.get(3));
        // hm.remove(2);
        // System.out.println(hm.get(2));
        // System.out.println(hm.containsKey(2));
        // System.out.println(hm.containsValue(20));
        // System.out.println(hm.size());

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // ConcurrentHashMapExp chm = new ConcurrentHashMapExp();
        // chm.put(1, 10);
        // chm.put(2, 20);
        // chm.put(3, 30);
        // System.out.println(chm.get(1));
        // System.out.println(chm.get(2));
        // System.out.println(chm.get(3));
        // chm.remove(2);
        // System.out.println(chm.get(2));
        // System.out.println(chm.containsKey(2));
        // System.out.println(chm.containsValue(20));
        // System.out.println(chm.size());
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // IdentityHashMapExp ihm = new IdentityHashMapExp();
        // ihm.put(1, 10);
        // ihm.put(2, 20);
        // ihm.put(3, 30);
        // System.out.println(ihm.get(1));
        // System.out.println(ihm.get(2));
        // System.out.println(ihm.get(3));
        // ihm.remove(1);
        // System.out.println(ihm.get(2));
        // System.out.println(ihm.containsKey(2));
        // System.out.println(ihm.containsValue(20));
        // System.out.println(ihm.size());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        WeakHashMapExp whm = new WeakHashMapExp();
        whm.put(1, 10);
        whm.put(2, 20);
        whm.put(3, 30);
        System.out.println(whm.get(1));
        System.out.println(whm.get(2));
        System.out.println(whm.get(3));
        whm.remove(1);
        System.out.println(whm.get(2));
        System.out.println(whm.containsKey(2));
        System.out.println(whm.containsValue(20));
        System.out.println(whm.size());
    }
}
