package Onlab.onlab3;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{" +this.name + " - " + this.age + "}";
    }
}
