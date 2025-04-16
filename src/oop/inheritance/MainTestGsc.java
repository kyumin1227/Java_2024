package oop.inheritance;

import oop.gsc.GscStudent;

class YjuStudent extends GscStudent {
    void toSomeThing() {
        int temp = x; // protected 멤버는 상속받음
        System.out.println(x);
    }
}

public class MainTestGsc {
    public static void main(String[] args) {
        YjuStudent yjuStudent = new YjuStudent();
//        System.out.println(gscStudent.print());
        yjuStudent.toSomeThing();
    }
}
