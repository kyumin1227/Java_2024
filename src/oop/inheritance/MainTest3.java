package oop.inheritance;

class Student {
    String name = "홍길동";
    int age = 20;

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}

public class MainTest3 {
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("이름: " + std.name + ", 나이: " + std.age);
        System.out.println(std);    // toString() 메서드 호출
    }
}
