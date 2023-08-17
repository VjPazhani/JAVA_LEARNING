package _24collection._4Map;
//cachee
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1
{
    public static void main(String[] args) {
        
        //2.order of the access
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                    return size()>5;
            }
        };
        //see the order
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "P"); //insertion means also cosiders as accessing
        

        //2.GET METHOD
        System.out.println(lhm.get(5));
        System.out.println(lhm.get(2));
        System.out.println(lhm.get(3));

        //see the order that changes into least access mode to recent access mode 

        lhm.forEach((k,v)-> System.out.println(k+ ","+v));



    }
}
/*
 * 1.order of maintained
 * 
 * LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(){
   protected boolean removeEldestEntry(Map.Entry e){
                    return size()>5;
            }};
        //see the order
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(7, "Z");
        lhm.put(6, "P"); //ORDER MAITAINED BY INSERTION
        lhm.forEach((k,v)-> System.out.println(k+ ","+v));

        //2.GET METHOD
        System.out.println(lhm.get(5));
        System.out.println(lhm.get(2));
        System.out.println(lhm.get(3));
 */