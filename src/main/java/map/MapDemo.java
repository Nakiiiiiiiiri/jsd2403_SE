package map;

import java.util.HashMap;
import java.util.Map;

/*Map是java集合框架的成员，map不是集合*/
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();


        Integer value = map.put("语文",99);//向map内添加
        System.out.println(value);//null

        map.put("数学",96);
        map.put("英语",97);
        map.put("物理",90);
        map.put("化学",79);
        System.out.println(map);
        //put
        //第二次存入数学。59会替换原本的96，并将96返回
        value = map.put("数学",59);
        System.out.println("更改后");
        System.out.println(map);
        System.out.println(value);//被替换的96
        //get
//根据给定的key返回valeue若给定的key不存在则，空指针返回NULL //value = map.get("97"); NULL
        value = map.get("英语");
        System.out.println("英语:"+value);
        //size
        int size = map.size();
        System.out.println("size="+size);
        //isEmpty
        boolean empty = map.isEmpty();
        System.out.println("map.isEmpty():"+empty);
        //remove
        value=map.remove("化学");
        System.out.println(value);//返回被移除的化学的分数
        System.out.println(map);
        //contains
        boolean subject = map.containsKey("政治");
        boolean score = map.containsValue(97);
        System.out.println("是否包含政治学科"+subject);
        System.out.println("是否有79这个成绩"+score);
        //clear
        map.clear();
        System.out.println(map);
    }
}
