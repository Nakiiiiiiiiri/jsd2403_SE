package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {
@AutoRunClass
    private String name = "张三";
    private int age = 18;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void sayHello(){
        System.out.println(name+":hello");
    }
    public void sayHi(){
        System.out.println(name+":hi");
    }
    public void sayBye(){
        System.out.println(name+"bye");
    }
    public void dosome(){
        System.out.println(name+":做某事");
    }
    @AutoRunMethod(value = 3,name="张三")
    public void sleep(){
        System.out.println(name+":睡觉");
    }
    public void watchTV(){
        System.out.println(name+":看电视");
    }
    @AutoRunMethod(name="张三")
    public void study(){
        System.out.println(name+":学习");
    }
    public void playGame(){
        System.out.println(name+":打游戏");
    }
    @AutoRunMethod(5)
    public void sing(){
        System.out.println(name+":唱歌");
    }

    public void say(String info){
        System.out.println(name+":"+info);
    }
    public void say( String info,int count){
        for(int i=0;i<count;i++){
            System.out.println(name+":"+info );
        }
    }
    public void running(){
        System.out.println(name+":正在跑步");
    }
    private void hehe(){
        System.out.println("私有方法");
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
