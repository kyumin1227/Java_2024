package oop.gsc;

class UserInfo {
    protected int x = 3;

    int getX() {
        return x;
    }
}

public class GscStudent extends UserInfo {
    void print() {
        System.out.println(getX());
        System.out.println(x);
    }

    public GscStudent() {
        System.out.println("GscStudent constructor");
    }
}
