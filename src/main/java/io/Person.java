package io;

import java.io.Serializable;
import java.util.Arrays;
//使当前类测试对象流的序列化与反序列化
//java bean
public class Person implements Serializable {//写出一个对象的类需要实现一个Serializable接口，反序列化
    private String name;
    private int age;
    private char Gender;
    private String[] otherinfo;
    Person(){}

    public Person(String name, int age, char gender, String[] otherinfo) {
        this.name = name;
        this.age = age;
        Gender = gender;
        this.otherinfo = otherinfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Gender=" + Gender +
                ", otherinfo=" + Arrays.toString(otherinfo) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public String[] getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String[] otherinfo) {
        this.otherinfo = otherinfo;
    }
}
