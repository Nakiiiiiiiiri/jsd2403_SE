package map;

import java.util.*;

/*遍历，map支持3种遍历
* 遍历所有key
* 遍历所有键值对
* 遍历所有value*/
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",100);
        map.put("英语",100);
        map.put("物理",90);
        map.put("化学",79);
        System.out.println(map);
        Set<String> keySet = map.keySet();
        //遍历key
        for(String key:keySet){
            System.out.print(key);
            System.out.println(map.get(key));
        }
        //遍历键值对
        Set<Map.Entry<String ,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String ,Integer> e:entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);

        }
        //遍历所有的values
        /*Entry:条目
          遍历每一组键值对的目的*/
        Collection<Integer> values = map.values();
        for(Integer value:values){
            System.out.println(value);
        }



    }
}
