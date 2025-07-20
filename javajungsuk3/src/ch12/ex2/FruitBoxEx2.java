package ch12.ex2;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy		          { public String toString() { return "Toy"  ;}}

interface Eatable {}

class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        //		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
        //		FruitBox<Toy>   toyBox    = new FruitBox<Toy>();   // 에러.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}

// 지네릭으로 들어올 수 있는 타입을 제한 (Fruit의 자손 + Eatable 구현)
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)  { list.add(item);      }
    T get(int i)      { return list.get(i); }
    int size()        { return list.size();  }
    public String toString() { return list.toString();}
}