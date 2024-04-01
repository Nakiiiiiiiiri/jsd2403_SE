package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        int countI = 0;
        int countLove = 0;
        String C = null;
        String Clove = null;
        String line = "I am studying java right now,thinking in java,HelloWorld,i love,i love";
        Map<String,Integer> map = new HashMap<>();
        Map<Character,Integer> mapchar = new HashMap<>();
        for(int i=0;i<line.length();i++){
             char c=line.charAt(i);
            if(mapchar.containsKey(c)){
                int num = mapchar.get(c);
                num++;
                mapchar.put(c,num);
            }else {
                mapchar.put(c,1);
            }
            /*C=""+c;
            if("i".equalsIgnoreCase(C)){
                countI++;
            }*/
        }
        for(int i=0;i<line.length();i++){
            if((line.length()-4)>=i){
                Clove = line.charAt(i)+""+line.charAt(i+1)+""+line.charAt(i+2)+""+line.charAt(i+3);
            }else break;
            if ("love".equalsIgnoreCase(Clove)) {
                countLove++;
            }

        }
        /*map.put("i",countI);*/
        map.put("love",countLove);
        System.out.println(map);
        System.out.println(mapchar);
//i:4  love:3

    }
}
