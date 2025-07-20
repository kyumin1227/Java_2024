package ch12.ex1;

import java.util.ArrayList;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        Box<Toy> toyBox = new Box<>();

//        Fruit 타입을 상속 받은 Apple과 Grape는 엘리먼트로 넣는 것이 가능
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());

        grapeBox.add(new Grape());

        toyBox.add(new Toy());

        System.out.println("Fruit Box: " + fruitBox);
        System.out.println("Apple Box: " + appleBox);
        System.out.println("Grape Box: " + grapeBox);
        System.out.println("Toy Box: " + toyBox);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int index) {
        return list.get(index);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}