/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2v2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Juanjo
 */
public class Kata2v2 {

    public static void main(String[] args) {
        int[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4, 12, 12, 12, 12};
        
       Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
       for(int i = 0; i<data.length; i++){
       histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i])+ 1 : 1);
       }

        Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = "+ entry.getKey() + " value = "+ entry.getValue());
        }
    }
    
    
}
