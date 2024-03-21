package string;

public class CharAt {
    public static void main(String[] args) {
        String line = "www.tedu.com";
        char c = line.charAt(4);
        System.out.println(c);
        for(int i=0;i<line.length();i++){
             c = line.charAt(i);
            System.out.print(c);

        }
        System.out.println();
        String str = "上海自来水来自海上";


        /*String front = str.substring(0,4);
        String secondhalf = str.substring(0,4);*/
            //思路1
        /*boolean check = true;
        for(int i=0;i<str.length()/2;i++){
            char front = str.charAt(i);
            char secondhalf = str.charAt(str.length()-1-i);
            if(front!=secondhalf){
                System.out.println("不是回文");
                check = false;
                break;
            }

        }
        if(check==true) {
            System.out.println("是回文");
        }*/

            //思路2
            /*for(int i=0;i<str.length()/2;i++){
                char front = str.charAt(i);
                char secondhalf = str.charAt(str.length()-1-i);
                if(front!=secondhalf){
                    System.out.println("不是回文");
                    break;
                    return;
                }

            }
            System.out.println("是回文");*/
            //思路3

            for(int i=0;i<str.length()/2;i++){
                char front = str.charAt(i);
                char secondhalf = str.charAt(str.length()-1-i);
                if(front!=secondhalf){
                    System.out.print("不");
                    break;
                }
            }
            System.out.println("是回文");




    }
}
