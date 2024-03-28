package Exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try{
            p.setAge(101);//接收到异常，选择抛出(永远不能在main上抛出)或者try catch，看异常归不归我管

        }
        catch (IllegalAgeException e){
            e.printStackTrace();
        }
        System.out.println("此人年龄是:"+p.getAge()+"岁");

    }
}
