package Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
class Student{
    public int id = 10;
    public String name = "xiaoming";
}
public class TestGson {
    public static void main(String[] args) {
        Student student = new Student();
        //要想进行转换，需要先准备好一个Gson实例
        //这种风格代码称为“工厂设计模式”
        // 不是直接new某个类的实例本身，而是借助其他类来创建该实例
        //此处借助GsonBuilder类来创建Gson实例
        //如果直接new Gson ，需要传入很多的参数，使用不便
        //GsonBuilder 就相当于一些常用的选项都提前设置好了
        //GsonBuilder 类就称为“工厂类”
        Gson gson = new GsonBuilder().create();
        //把对象转成JSON字符串
        String studentString = gson.toJson(student);
        System.out.println(studentString);
        //把JSON字符串转回成对象
        //fromJson 内部也是需要借助反射来实现的
        Student student2 = gson.fromJson(studentString, Student.class);
        System.out.println(student2.id);
        System.out.println(student2.name);

    }
}


